package me.wonderful.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import me.wonderful.entity.SystemUser;
import me.wonderful.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
 * @author xiongchaodu
 * @date 2022/03/31 17:03
 **/
@Service
public class UserServiceImpl extends ServiceImpl<SysUserMapper, SystemUser> {
}
