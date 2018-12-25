package com.wkang.springboot.demo.config;

import com.wkang.springboot.demo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @author kangwei
 * @date 2018/12/25
 * @Configuration 代表了这是一个Java配置文件,Spring容器会根据他来生成IoC容器来装配Bean;
 * @Bean 代表了将initUser方法返回的POJO装配到IoC容器中，其属性name定义了这个Bean的名称。
 * @ComponentScan 说明他会扫描，但是扫描的只是类AppConfig所在包和他的子包
 * excludeFilters = {@ComponentScan.Filter(classes = {Service.class})}
 * 使标注了@Service的类不被IoC容器扫描注入
 */

@Configuration
//@ComponentScan("com.wkang.springboot.demo.pojo")
@ComponentScan(basePackages = "com.wkang.springboot.demo.*", excludeFilters = {@ComponentScan.Filter(classes = {Service.class})})
//@ComponentScan(basePackageClasses = {User.class})
public class AppConfig {

}
