package com.boom.myblog.service;

import com.boom.myblog.entity.FileEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Vincent
 * @since 2022-04-19
 */
public interface IFileService extends IService<FileEntity> {
    public int insertBatchFile(List<FileEntity> fileEntityList);
}
