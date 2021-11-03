package com.ban.mapper;

import com.ban.entity.sys_user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    sys_user loadUserById(long id);
}
