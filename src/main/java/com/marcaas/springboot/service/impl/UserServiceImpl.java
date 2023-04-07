package com.marcaas.springboot.service.impl;

import com.marcaas.springboot.entity.User;
import com.marcaas.springboot.mapper.UserMapper;
import com.marcaas.springboot.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author marcaas
 * @since 2023-04-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
