package com.wisely.highlight_spring4.ch1.di;
import org.springframework.stereotype.Service;

//ʹ��service������ǰFunctionService����Spring�����һ��Bean
@Service
public class FunctionService {
	
	public String sayHello(String word){
		return "hello "+word +"! ";
	}

}
