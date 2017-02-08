package com.wisely.highlight_spring4.ch1.di;
import org.springframework.stereotype.Service;

//使用service声明当前FunctionService类是Spring管理的一个Bean
@Service
public class FunctionService {
	
	public String sayHello(String word){
		return "hello "+word +"! ";
	}

}
