package com.boom.myblog.service.impl;

import com.boom.myblog.entity.File;
import com.boom.myblog.mapper.FileMapper;
import com.boom.myblog.service.IFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Vincent
 * @since 2022-04-19
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}
