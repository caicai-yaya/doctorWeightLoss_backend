/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : db_mediweightloss

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 19/03/2025 22:13:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bowel_logs
-- ----------------------------
DROP TABLE IF EXISTS `bowel_logs`;
CREATE TABLE `bowel_logs`  (
  `bl_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '排便记录编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `date` date NULL DEFAULT NULL COMMENT '记录日期',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '排便时间',
  `frequency` int(0) NULL DEFAULT 0 COMMENT '排便次数，默认次数0',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '排便状态',
  PRIMARY KEY (`bl_id`) USING BTREE,
  UNIQUE INDEX `bl_id`(`bl_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 12 排便记录表(Bowel_Logs)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for community_comments
-- ----------------------------
DROP TABLE IF EXISTS `community_comments`;
CREATE TABLE `community_comments`  (
  `comment_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '评论编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `post_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '日志id，关联Community_Posts.id',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论内容',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '评论日期',
  PRIMARY KEY (`comment_id`) USING BTREE,
  UNIQUE INDEX `comment_id`(`comment_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 16 社区评论表(Community_Comments)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for community_content_recommendations
-- ----------------------------
DROP TABLE IF EXISTS `community_content_recommendations`;
CREATE TABLE `community_content_recommendations`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '推荐记录编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `post_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '日志id，关联Community_Posts.post_id',
  `date` date NULL DEFAULT NULL COMMENT '推荐日期',
  `score` float NULL DEFAULT NULL COMMENT '推荐评分',
  `viewed` tinyint(1) NULL DEFAULT NULL COMMENT '用户是否查看',
  `interacted` tinyint(1) NULL DEFAULT NULL COMMENT '用户是否与内容有交互',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `id`(`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 6 个性化社区内容推荐表(Community_Content_Recommendations)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for community_posts
-- ----------------------------
DROP TABLE IF EXISTS `community_posts`;
CREATE TABLE `community_posts`  (
  `post_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '日志编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '日志发布日期',
  `content` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '日志内容',
  `likes` int(0) NULL DEFAULT NULL COMMENT '点赞数量',
  `comments` int(0) NULL DEFAULT NULL COMMENT '评论数量',
  PRIMARY KEY (`post_id`) USING BTREE,
  UNIQUE INDEX `post_id`(`post_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 15 社区互动表(Community_Posts)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for daily_diet_recommendations
-- ----------------------------
DROP TABLE IF EXISTS `daily_diet_recommendations`;
CREATE TABLE `daily_diet_recommendations`  (
  `diet_recommendation_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '每日饮食推荐编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `date` date NULL DEFAULT NULL COMMENT '推荐日期',
  `breakfast` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '早餐建议',
  `lunch` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '午餐建议',
  `dinner` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '晚餐建议',
  `snacks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '加餐建议',
  PRIMARY KEY (`diet_recommendation_id`) USING BTREE,
  UNIQUE INDEX `diet_recommendation_id`(`diet_recommendation_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 4 每日饮食推荐表(Daily_Diet_Recommendations)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for daily_exercise_recommendations
-- ----------------------------
DROP TABLE IF EXISTS `daily_exercise_recommendations`;
CREATE TABLE `daily_exercise_recommendations`  (
  `ex_recommendation_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '每日运动推荐编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `date` date NULL DEFAULT NULL COMMENT '推荐日期',
  `exercise_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运动名称',
  `duration` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运动时长',
  `calories_burned` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预估运动消耗的卡路里',
  `exercise_id` int(0) NOT NULL COMMENT '运动id，外键关联Exercises. exercise_id',
  PRIMARY KEY (`ex_recommendation_id`) USING BTREE,
  UNIQUE INDEX `ex_recommendation_id`(`ex_recommendation_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 5 每日个性化运动推荐表(Daily_Exercise_Recommendations)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for device_bindings
-- ----------------------------
DROP TABLE IF EXISTS `device_bindings`;
CREATE TABLE `device_bindings`  (
  `binding_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '绑定编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `device_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '设备id',
  `device_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '设备类型（如手环、体重秤、跑步机等）',
  `binding_date` datetime(0) NULL DEFAULT NULL COMMENT '绑定时间',
  `is_active` int(0) NULL DEFAULT 0 COMMENT '绑定状态，是否绑定（1 绑定，0未绑定）（默认0 未绑定）',
  PRIMARY KEY (`binding_id`) USING BTREE,
  UNIQUE INDEX `binding_id`(`binding_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 3设备绑定表(Device_Bindings)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for doctor_advice
-- ----------------------------
DROP TABLE IF EXISTS `doctor_advice`;
CREATE TABLE `doctor_advice`  (
  `advice_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '建议编号，主键',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '患者编号，外键，与相关联—Users.user_id',
  `doctor_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '医生编号，与相关联—Doctors.doctor_id',
  `advice_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '建议类型（如食材替换、睡眠等）',
  `advice_content` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '建议内容',
  PRIMARY KEY (`advice_id`) USING BTREE,
  UNIQUE INDEX `advice_id`(`advice_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医生端—表 3 医生建议表(Doctor_Advice)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for doctor_feedback
-- ----------------------------
DROP TABLE IF EXISTS `doctor_feedback`;
CREATE TABLE `doctor_feedback`  (
  `feedback_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '反馈编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '患者编号，外键',
  `doctor_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '医生编号，外键',
  `feedback_content` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '反馈内容',
  `feedback_date` datetime(0) NULL DEFAULT NULL COMMENT '反馈日期',
  PRIMARY KEY (`feedback_id`) USING BTREE,
  UNIQUE INDEX `feedback_id`(`feedback_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医生端—表 6 医生反馈表(Doctor_Feedback)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for doctors
-- ----------------------------
DROP TABLE IF EXISTS `doctors`;
CREATE TABLE `doctors`  (
  `doctor_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '医生编号，主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '医生姓名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码\r\n',
  `specialty` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业领域',
  `qualification` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执业资格',
  `experience_years` int(0) NULL DEFAULT 0 COMMENT '工作年数，默认0',
  `contact_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电子邮箱',
  `profile_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`doctor_id`) USING BTREE,
  UNIQUE INDEX `doctor_id`(`doctor_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医生端—表 1 医生信息表(Doctors) ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for exercise_logs
-- ----------------------------
DROP TABLE IF EXISTS `exercise_logs`;
CREATE TABLE `exercise_logs`  (
  `el_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '运动记录编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `exercise_id` int(0) NOT NULL COMMENT '运动id，外键，关联Exercises.exercise_id',
  `exercise_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运动名称',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '记录日期',
  `duration` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运动时长',
  `calories_burned` varbinary(255) NULL DEFAULT NULL COMMENT '消耗卡路里',
  PRIMARY KEY (`el_id`) USING BTREE,
  UNIQUE INDEX `el_id`(`el_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 14 运动记录表(Exercise_Logs)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for exercises
-- ----------------------------
DROP TABLE IF EXISTS `exercises`;
CREATE TABLE `exercises`  (
  `exercise_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '运动编号，主键（唯一、自增',
  `exercise_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '运动名称',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运动类型',
  `details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运动详细介绍',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`exercise_id`) USING BTREE,
  UNIQUE INDEX `exercise_id`(`exercise_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 13 运动表(Exercises)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for food_logs
-- ----------------------------
DROP TABLE IF EXISTS `food_logs`;
CREATE TABLE `food_logs`  (
  `fl_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '饮食记录编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `food_id` int(0) NOT NULL COMMENT '食物编号，外键关联Foods.food_id',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '记录日期',
  `meal_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '餐次类型（早/中/晚/加餐）',
  `method` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '记录方式（手动/图片上传）',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `sum` int(0) NULL DEFAULT NULL COMMENT '多少份',
  PRIMARY KEY (`fl_id`) USING BTREE,
  UNIQUE INDEX `fl_id`(`fl_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 9 饮食记录表(Food_Logs)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for foods
-- ----------------------------
DROP TABLE IF EXISTS `foods`;
CREATE TABLE `foods`  (
  `food_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '食物编号，主键（唯一、自增',
  `food_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '食物名称',
  `category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类（如主食、蔬菜等等）',
  `calories` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '卡路里',
  `protein` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '蛋白质',
  `fat` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '脂肪含量',
  `unit` int(0) NULL DEFAULT NULL COMMENT '份量单位',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '食物图片',
  `details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '食物详细',
  PRIMARY KEY (`food_id`) USING BTREE,
  UNIQUE INDEX `food_id`(`food_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 8 食物表(Foods)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for health_reports
-- ----------------------------
DROP TABLE IF EXISTS `health_reports`;
CREATE TABLE `health_reports`  (
  `report_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '报告编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '患者编号，外键',
  `doctor_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '医生编号，外键',
  `report_date` datetime(0) NULL DEFAULT NULL COMMENT '报告日期',
  `weight_change` float NULL DEFAULT NULL COMMENT '体重变化',
  `fat_percentage_change` float NULL DEFAULT NULL COMMENT '体脂变化',
  `health_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '健康状况',
  `physical_activity_level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '体力活动水平',
  `recommendations` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '综合建议',
  PRIMARY KEY (`report_id`) USING BTREE,
  UNIQUE INDEX `report_id`(`report_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医生端—表 5 综合健康报告表(Health_Reports)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for health_trends
-- ----------------------------
DROP TABLE IF EXISTS `health_trends`;
CREATE TABLE `health_trends`  (
  `trend_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '趋势编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '患者编号',
  `weight` float NULL DEFAULT NULL COMMENT '体重',
  `fat_percentage` float NULL DEFAULT NULL COMMENT '体脂率',
  `record_date` datetime(0) NULL DEFAULT NULL COMMENT '记录日期',
  PRIMARY KEY (`trend_id`) USING BTREE,
  UNIQUE INDEX `trend_id`(`trend_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医生端—表 4 健康指标趋势表(Health_Trends)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for knowledge_base
-- ----------------------------
DROP TABLE IF EXISTS `knowledge_base`;
CREATE TABLE `knowledge_base`  (
  `knowledge_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '知识编号，主键，自增',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '知识标题',
  `content` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '知识内容',
  `category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类1234…（可以分为比如饮食、运动、心理健康等）没时间写也可以不分了',
  `source` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '知识来源',
  `last_updated` datetime(0) NULL DEFAULT NULL COMMENT '最后更新时间',
  `type` int(0) NULL DEFAULT NULL COMMENT '知识类型1234……（比如文章、视频、课程等）',
  PRIMARY KEY (`knowledge_id`) USING BTREE,
  UNIQUE INDEX `knowledge_id`(`knowledge_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '医生端—表 2 知识库表(Knowledge_Base)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `order_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '订单编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `product_id` int(0) NOT NULL COMMENT '商品id，外键，关联Products.product_id',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '订单日期',
  `price` float NULL DEFAULT NULL COMMENT '订单价格',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单内容',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单状态（如已支付/已发货等）',
  PRIMARY KEY (`order_id`) USING BTREE,
  UNIQUE INDEX `order_id`(`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 18 订单表(Orders)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product__recommendations
-- ----------------------------
DROP TABLE IF EXISTS `product__recommendations`;
CREATE TABLE `product__recommendations`  (
  `pro_recommendation_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '商品推荐编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `product_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品类别',
  `reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '推荐理由',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片',
  PRIMARY KEY (`pro_recommendation_id`) USING BTREE,
  UNIQUE INDEX `pro_recommendation_id`(`pro_recommendation_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 7 个性化商品推荐表(Product__Recommendations)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `product_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '商品编号，主键（唯一、自增',
  `product_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品描述',
  `price` float NULL DEFAULT NULL COMMENT '价格',
  `stock` int(0) NULL DEFAULT NULL COMMENT '库存数',
  PRIMARY KEY (`product_id`) USING BTREE,
  UNIQUE INDEX `product_id`(`product_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 17 商品表(Products)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for reminders
-- ----------------------------
DROP TABLE IF EXISTS `reminders`;
CREATE TABLE `reminders`  (
  `reminder_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '提醒编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '提醒类型（如饮水/排便等）',
  `time` datetime(0) NULL DEFAULT NULL COMMENT '提醒时间',
  `status` int(0) NULL DEFAULT 0 COMMENT '提醒状态（如1启用/0关闭）（默认0关闭）',
  PRIMARY KEY (`reminder_id`) USING BTREE,
  UNIQUE INDEX `reminder_id`(`reminder_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 19 智能提醒表(Reminders)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sleep_logs
-- ----------------------------
DROP TABLE IF EXISTS `sleep_logs`;
CREATE TABLE `sleep_logs`  (
  `sl_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '睡眠记录编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '记录日期',
  `total_sleep` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '总睡眠时长',
  `deep_sleep` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '深度睡眠时长',
  `light_sleep` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '浅睡眠时长',
  PRIMARY KEY (`sl_id`) USING BTREE,
  UNIQUE INDEX `sl_id`(`sl_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 11 睡眠记录表(Sleep_Logs)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户编号，主键（唯一',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `third_party_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '第三方平台账号id，如微信、QQ等',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `user_role` int(0) NOT NULL DEFAULT 1 COMMENT '用户角色（1.普通用户、2.肥胖用户）默认为1普通用户',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `birthday` date NULL DEFAULT NULL COMMENT '生日',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `height` float NULL DEFAULT NULL COMMENT '身高',
  `weight` float NULL DEFAULT NULL COMMENT '体重',
  `fat_percentage` float NULL DEFAULT NULL COMMENT '体脂率',
  `health_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '健康状况',
  `target_weight` float NULL DEFAULT NULL COMMENT '预期体重',
  `preference` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '饮食偏好（如素食等）',
  `allergies` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '过敏原',
  `registration` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  `last_login` datetime(0) NULL DEFAULT NULL COMMENT '最后登陆时间',
  `is_active` int(0) NOT NULL DEFAULT 1 COMMENT '用户状态，是否激活1.激活 0.未激活，默认为1',
  PRIMARY KEY (`user_id`) USING BTREE,
  UNIQUE INDEX `user_id`(`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 1 用户表(Users)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for water_logs
-- ----------------------------
DROP TABLE IF EXISTS `water_logs`;
CREATE TABLE `water_logs`  (
  `wl_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '饮水记录编号，主键（唯一、自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '记录日期',
  `water_intake` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '饮水量',
  PRIMARY KEY (`wl_id`) USING BTREE,
  UNIQUE INDEX `wl_id`(`wl_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 10 饮水记录表(Water_Logs)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for weight_loss_plan
-- ----------------------------
DROP TABLE IF EXISTS `weight_loss_plan`;
CREATE TABLE `weight_loss_plan`  (
  `plan_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '计划编号，主键(唯一，自增',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id，外键，关联Users.user_id',
  `loss_goal` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '减重目标（如减脂、增肌、塑形）',
  `plan_detail` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '计划内容',
  `plan_scene` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '计划场景（如生病、工作压力、社交应酬、运动受伤、女性生理期、节假日、四季等）',
  `start_date` datetime(0) NULL DEFAULT NULL COMMENT '计划开始日期',
  `end_date` datetime(0) NULL DEFAULT NULL COMMENT '计划结束日期',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '计划状态123…（如进行中、已完成、已调整）',
  `daily_calories_goal` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '每日卡路里摄入量',
  `daily_water_goal` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '每日饮水目标',
  PRIMARY KEY (`plan_id`) USING BTREE,
  UNIQUE INDEX `plan_id`(`plan_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户端—表 2 减重计划表(Weight_Loss_Plan)' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
