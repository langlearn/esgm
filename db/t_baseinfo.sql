/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.213
Source Server Version : 50610
Source Host           : 192.168.1.213:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2013-05-07 15:27:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_baseinfo`
-- ----------------------------
DROP TABLE IF EXISTS `t_baseinfo`;
CREATE TABLE `t_baseinfo` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `ccode` varchar(50) DEFAULT NULL,
  `cname` varchar(50) DEFAULT NULL,
  `csort` varchar(10) DEFAULT NULL COMMENT '类别',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='基础数据\r\nAREA区域';

-- ----------------------------
-- Records of t_baseinfo
-- ----------------------------
INSERT INTO `t_baseinfo` VALUES ('1', '01', '华北大区', 'AREA');
INSERT INTO `t_baseinfo` VALUES ('2', '02', '华南大区', 'AREA');
INSERT INTO `t_baseinfo` VALUES ('3', '03', '订单', null);
