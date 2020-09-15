package com.z5x.controller;

import com.z5x.model.User;
import com.z5x.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author shijiu
 * datetime：20200906
 */
@Api(value = "用户管理",tags = {"用户管理"})
@RestController
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("list")
    public List<User> Test(){
        return userService.getAll();
    }
}
