package com.boom.myblog.mapper;

import com.boom.myblog.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author Vincent
 * @since 2022-03-25
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
