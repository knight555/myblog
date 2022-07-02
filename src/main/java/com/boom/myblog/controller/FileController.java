package com.boom.myblog.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.boom.myblog.utils.PropertiesUtils;
import io.swagger.annotations.Api;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

@RestController
@RequestMapping("/v1.0/file")
@Api(tags = "文件")
public class FileController {

    /**
     * 属性配置
     */
    private static PropertiesUtils pro = PropertiesUtils.getInstance();

    @GetMapping("/downloadFile")
    public ResponseEntity<FileSystemResource> downloadFile(String path) {
        return export(new File(path));
    }

    public ResponseEntity<FileSystemResource> export(File file) {
        if (file == null) {
            return null;
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", "attachment; filename=" + file.getName());
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        headers.add("Last-Modified", new Date().toString());
        headers.add("ETag", String.valueOf(System.currentTimeMillis()));
        return ResponseEntity
                .ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(new FileSystemResource(file));
    }

//    @RequestMapping(value = "/uploadFile", method = { RequestMethod.POST,RequestMethod.GET })
    @PostMapping("/uploadFile")
    @CrossOrigin
    public Integer uploadFile(@RequestParam("multipart") MultipartFile[] multipartList,
                      @RequestParam(required = false) String userId) throws IOException {
        if (multipartList==null) {
            throw new RuntimeException("文件为空");
        }
        String filename = "";
        Integer num = 0;
        Path path = null;
        for (MultipartFile multipart : multipartList) {
            // get the suffix
            String[] strArray = multipart.getOriginalFilename().split("\\.");
            int suffixIndex = strArray.length - 1;
            // get the file and save it somewhere
            byte[] bytes = multipart.getBytes();
            num++;
            filename = DateUtil.date().toString("yyyy" + "MM" + "dd") + "-" + userId + "-"+ IdUtil.simpleUUID() +"-" + num + "." + strArray[suffixIndex];
            path = Paths.get(pro.getAttachmentPath() + filename);
            Files.write(path, bytes);
        }
        return num;
    }

    @PostMapping("/uploadImage")
    String uploadImage(@RequestParam("multipart") MultipartFile[] multipartList){
        return null;
    }

}
