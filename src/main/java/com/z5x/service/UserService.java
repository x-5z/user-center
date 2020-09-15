package com.z5x.service;

import com.z5x.dao.UserMapper;
import com.z5x.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author shijiu
 * datetime：20200906
 */

public interface UserService {

    /** 获得所有用户
     * @return List
     */
     List<User> getAll();
}
