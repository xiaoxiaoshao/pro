package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration������ǰ����һ��������
//@ComponentScan���Զ�ɨ�����������ʹ��@Service,@Component,@Respository��@Controller ���࣬��ע��ΪBean
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.di")
public class DiConfig {

}
