package com.z5x.service;

import com.z5x.dao.TestMapper;
import com.z5x.model.TestModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author shijiu
 * datetime：20200906
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    public List<TestModel> getAll(){
        return testMapper.getAll();
    }
}
