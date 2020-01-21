package com.defence.nevermore.auth.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: java类作用描述
 * @Author:
 */
@MapperScan(basePackages = "com.defence.nevermore.auth.mapper")
@Configuration
public class MybatisConfig {
}
