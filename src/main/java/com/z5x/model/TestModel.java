package com.z5x.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author shijiu
 * datetime：20200906
 */
@ApiModel
public class TestModel {
    @ApiModelProperty
    private Integer id;
    @ApiModelProperty
    private String test;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
