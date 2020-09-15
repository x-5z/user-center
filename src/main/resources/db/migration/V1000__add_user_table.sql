DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(36) NOT NULL COMMENT '用户ID（UUID）',
  `nickname` varchar(32) DEFAULT NULL COMMENT '呢称',
  `password` varchar(256) DEFAULT NULL COMMENT '密码',
  `realname` varchar(32) DEFAULT NULL COMMENT '真实姓名',
  `mobile` char(13) DEFAULT NULL COMMENT '手机号',
  `budget_min` int(11) NOT NULL DEFAULT '0' COMMENT '租房最小预算',
  `budget_max` int(11) NOT NULL DEFAULT '0' COMMENT '租房最大预算',
  `intention_province` varchar(10) NOT NULL DEFAULT '0' COMMENT '租房区域--省',
  `intention_city` varchar(10) NOT NULL DEFAULT '0' COMMENT '租房区域--市',
  `intention_area` varchar(20) NOT NULL DEFAULT '0' COMMENT '租房区域--区',
  `intention_address` varchar(100) NOT NULL DEFAULT '0' COMMENT '租房区域--详细地址',
  `user_type` int(11) NOT NULL DEFAULT '1' COMMENT '状态：0 -管理员；1 - 用户',
  `personal_signature` varchar(500) DEFAULT NULL DEFAULT '' COMMENT '个性签名',
  `personal_background` varchar(500) DEFAULT NULL DEFAULT '' COMMENT '个性背景图',
  `head_image_url` varchar(256) DEFAULT NULL COMMENT '头像',
  `birthdate` varchar(36) NOT NULL DEFAULT '' COMMENT '出生年月日',
  `sex` int(11) NOT NULL DEFAULT '0' COMMENT '性别：0 - 女；1 - 男',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '状态：0 - 已删除；1 - 正常, 2 - 锁定',
  `email` varchar(20) DEFAULT '' COMMENT '邮箱',
  `remark` varchar(255) DEFAULT '' COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `mobile_unique` (`mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '用户表';

INSERT INTO `user` (`id`, `nickname`, `password`, `realname`, `mobile`,`budget_min`, `budget_max`, `intention_province`, `intention_city`, `intention_area`, `intention_address`, `user_type`,`personal_signature`,`personal_background`, `head_image_url`, `birthdate`, `sex`, `status`, `email`, `remark`, `create_time`, `update_time`, `last_login_time`) VALUES ('1000000', 'admin', '$2a$10$682OCbTfT7BhNb9HNC.fqe9kTejUaLDePK3ZWNBxXxJI2ihXmlaf6', 'zhangsan', '13874940542','800','2000','广东省','深圳市','南山区','蛇口工业区','0','','','xxx', '2000-06-23', '1', '1', 'haigemsa@qq.com', '无', '2019-07-18 10:52:14', '2019-07-18 10:52:26', '2019-07-18 10:52:31');
