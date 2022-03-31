package me.wonderful.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author xiongchaodu
 * @date 2022/03/31 16:22
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SystemUser extends BaseBean {

    private String username;
    private String password;
    private String nicName;
    private String phone;
    private Boolean admin;
}
