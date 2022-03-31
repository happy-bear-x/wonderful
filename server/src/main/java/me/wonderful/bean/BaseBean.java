package me.wonderful.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

/**
 * @author xiongchaodu
 * @date 2022/03/31 16:23
 **/
public class BaseBean {
    
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("updateTime")
    private LocalDateTime updateTime;
}
