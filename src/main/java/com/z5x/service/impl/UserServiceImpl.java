package com.z5x.service.impl;

import com.z5x.dao.UserMapper;
import com.z5x.model.User;
import com.z5x.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * User Service实现类，Created on 2020-09-15.
 * @author Lucas
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAll(){
        return userMapper.getAll();
    }

}
