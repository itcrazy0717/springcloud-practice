DROP DATABASE IF EXISTS cloudDB01;
CREATE DATABASE cloudDB01 CHARACTER SET UTF8;
DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发部', DATABASE());
INSERT INTO `dept` VALUES ('2', '人事部', DATABASE());
INSERT INTO `dept` VALUES ('3', '财务部', DATABASE());
INSERT INTO `dept` VALUES ('4', '市场部', DATABASE());
INSERT INTO `dept` VALUES ('5', '运维部', DATABASE());
INSERT INTO `dept` VALUES ('8', '物流部', DATABASE());
INSERT INTO `dept` VALUES ('9', '餐饮部', DATABASE());
INSERT INTO `dept` VALUES ('10', '大数据部', DATABASE());