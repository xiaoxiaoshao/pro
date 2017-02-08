package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration声明当前类是一个配置类
//@ComponentScan，自动扫描包名下所有使用@Service,@Component,@Respository和@Controller 的类，并注册为Bean
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.di")
public class DiConfig {

}
