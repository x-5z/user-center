package com.z5x.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
* Created by Mybatis Generator on 2020/09/15
* @author cw
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     * 用户ID（UUID）
     */
    @ApiModelProperty("用户ID（UUID）")
    private String id;

    /**
     * 呢称
     */
    @ApiModelProperty("呢称")
    private String nickname;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 真实姓名
     */
    @ApiModelProperty("真实姓名")
    private String realname;

    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    private String mobile;

    /**
     * 租房最小预算
     */
    @ApiModelProperty("租房最小预算")
    private Integer budgetMin;

    /**
     * 租房最大预算
     */
    @ApiModelProperty("租房最大预算")
    private Integer budgetMax;

    /**
     * 租房区域--省
     */
    @ApiModelProperty("租房区域--省")
    private String intentionProvince;

    /**
     * 租房区域--市
     */
    @ApiModelProperty("租房区域--市")
    private String intentionCity;

    /**
     * 租房区域--区
     */
    @ApiModelProperty("租房区域--区")
    private String intentionArea;

    /**
     * 租房区域--详细地址
     */
    @ApiModelProperty("租房区域--详细地址")
    private String intentionAddress;

    /**
     * 状态：0 -管理员；1 - 用户
     */
    @ApiModelProperty("状态：0 -管理员；1 - 用户")
    private Integer userType;

    /**
     * 个性签名
     */
    @ApiModelProperty("个性签名")
    private String personalSignature;

    /**
     * 个性背景图
     */
    @ApiModelProperty("个性背景图")
    private String personalBackground;

    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String headImageUrl;

    /**
     * 出生年月日
     */
    @ApiModelProperty("出生年月日")
    private String birthdate;

    /**
     * 性别：0 - 女；1 - 男
     */
    @ApiModelProperty("性别：0 - 女；1 - 男")
    private Integer sex;

    /**
     * 状态：0 - 已删除；1 - 正常, 2 - 锁定
     */
    @ApiModelProperty("状态：0 - 已删除；1 - 正常, 2 - 锁定")
    private Integer status;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private Date updateTime;

    /**
     * 上次登录时间
     */
    @ApiModelProperty("上次登录时间")
    private Date lastLoginTime;
}