package me.wonderful.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.wonderful.bean.SystemUser;
import me.wonderful.vo.LoginBody;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiongchaodu
 * @date 2022/03/31 16:49
 **/
@Mapper
public interface SysUserMapper extends BaseMapper<SystemUser> {

    /**
     * 登录查询数据库
     * @param loginBody
     * @return SystemUser
     */
    @Select("select * from systemUser where (username=#{username} or phone=#{username}) and password=#{password}")
    SystemUser login(LoginBody loginBody);
}
