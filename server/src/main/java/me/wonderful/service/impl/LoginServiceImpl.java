package me.wonderful.service.impl;

import me.wonderful.bean.SystemUser;
import me.wonderful.component.RedisCache;
import me.wonderful.mapper.SysUserMapper;
import me.wonderful.service.LoginService;
import me.wonderful.vo.LoginBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

/**
 * @author xiongchaodu
 * @date 2022/03/31 17:06
 **/
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private RedisCache redisCache;

    @Override
    public String login(LoginBody loginInfo) {
        SystemUser user = userMapper.login(loginInfo);
        if (Objects.isNull(user)) {
            return null;
        }
        String token = UUID.randomUUID().toString();
        redisCache.setCacheObject(token, user);
        return token;
    }
}
