package com.boom.myblog.service.impl;

import com.boom.myblog.entity.SysUser;
import com.boom.myblog.mapper.SysUserMapper;
import com.boom.myblog.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Vincent
 * @since 2022-03-25
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
