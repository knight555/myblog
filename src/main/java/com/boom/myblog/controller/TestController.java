package com.boom.myblog.controller;

import com.boom.myblog.utils.RunPythonUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/runPyTest")
    public String hello2() {
        String[] args=new String[]{"E:/GIS/dfs.dbf","E:/GIS/aaaabbb.dbf"};
        RunPythonUtils.run("E:/pyhere/gf77/main.py",args);
        return "welcome xzy.com!!!";
    }

    @GetMapping("/hello")
    @CrossOrigin
    public String hello(){
        return "hahahha, finally!";
    }

}
