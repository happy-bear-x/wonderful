package me.wonderful.Interceptor;

import com.alibaba.fastjson.JSON;
import me.wonderful.bean.SystemUser;
import me.wonderful.common.AjaxResult;
import me.wonderful.component.RedisCache;
import me.wonderful.constants.Constants;
import me.wonderful.constants.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @author xiongchaodu
 * @date 2022/03/31 15:57
 **/
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    private RedisCache redisCache;
    /**
     * 未登录
     */
    private final Object error = JSON.toJSON(AjaxResult.error(HttpStatus.UNAUTHORIZED, "未登录"));
    

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(Constants.TOKEN);
        if (StringUtils.hasText(token)) {
            SystemUser userInfo = redisCache.getCacheObject(token);
            return !Objects.isNull(userInfo);
        }
        response.getWriter().print(error);
        return false;
    }
}
