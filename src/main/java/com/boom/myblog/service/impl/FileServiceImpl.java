package com.boom.myblog.service.impl;

import com.boom.myblog.entity.FileEntity;
import com.boom.myblog.mapper.FileMapper;
import com.boom.myblog.service.IFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Vincent
 * @since 2022-04-19
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, FileEntity> implements IFileService {

    @Override
    public int insertBatchFile(List<FileEntity> fileEntityList) {
        return 0;
    }
}
