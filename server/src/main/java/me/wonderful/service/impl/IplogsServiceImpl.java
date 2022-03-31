package me.wonderful.service.impl;

import me.wonderful.bean.Iplogs;
import me.wonderful.mapper.IplogsMapper;
import me.wonderful.service.IIplogsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2022-03-24
 */
@Service
public class IplogsServiceImpl extends ServiceImpl<IplogsMapper, Iplogs> implements IIplogsService {

}
