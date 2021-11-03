package com.ban.service;

import com.ban.entity.sys_user;
import org.springframework.stereotype.Service;

public interface SysUserService {
    sys_user loadUserById(long id);
}
