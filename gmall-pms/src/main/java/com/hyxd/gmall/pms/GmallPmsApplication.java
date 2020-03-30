package com.hyxd.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、配置整合dubbo
 * 2、配置整合MybatisPlus
 *
 * logstash整合
 * 1)、导jar
 * 2)、导日志配置
 * 3）、在kibanna里面建立好日志的索引，就可以可视化检索了
 */
@EnableDubbo
@MapperScan(basePackages = "com.hyxd.gmall.pms.mapper")
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
