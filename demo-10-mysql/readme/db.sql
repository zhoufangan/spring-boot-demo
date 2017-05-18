CREATE SCHEMA `my_app` DEFAULT CHARACTER SET utf8 ;
use my_app;

CREATE TABLE `my_app`.`user` (
  `user_id` INT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` VARCHAR(45) NOT NULL DEFAULT '' COMMENT '用户名称',
  `user_age` INT(3) NOT NULL DEFAULT 0 COMMENT '用户年龄',
  `gender` TINYINT(2) NOT NULL DEFAULT 0 COMMENT '用户性别: 0未知 1男 2女',
  `create_time` DATETIME NOT NULL DEFAULT now() COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
);