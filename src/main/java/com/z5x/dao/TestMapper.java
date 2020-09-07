package com.z5x.dao;

import com.z5x.model.TestModel;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author shijiu
 * datetime：20200906
 */
public interface TestMapper {
     List<TestModel> getAll();
}
