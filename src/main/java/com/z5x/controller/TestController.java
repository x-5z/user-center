package com.z5x.controller;

import com.z5x.model.TestModel;
import com.z5x.service.TestService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author shijiu
 * datetime：20200906
 */
@Api(value = "测试",tags = {"测试"})
@RestController
public class TestController {
    @Resource
    private TestService testService;
    @GetMapping("test")
    public List<TestModel> Test(){

        return testService.getAll();
    }
}
