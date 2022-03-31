package me.wonderful.service;

import me.wonderful.vo.LoginBody;

/**
 * @author xiongchaodu
 * @date 2022/03/31 17:05
 **/
public interface LoginService {

    /**
     * 登录
     * @param loginInfo
     * @return token
     */
    String login(LoginBody loginInfo);
}
