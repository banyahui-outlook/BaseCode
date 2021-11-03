package com.ban.service.impl;

import com.ban.entity.sys_user;
import com.ban.mapper.SysUserMapper;
import com.ban.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public sys_user loadUserById(long id) {

        return sysUserMapper.loadUserById(id);
    }
}
