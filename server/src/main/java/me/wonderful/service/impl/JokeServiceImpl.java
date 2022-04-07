package me.wonderful.service.impl;

import me.wonderful.entity.Joke;
import me.wonderful.mapper.JokeMapper;
import me.wonderful.service.IJokeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-04-07
 */
@Service
public class JokeServiceImpl extends ServiceImpl<JokeMapper, Joke> implements IJokeService {

}
