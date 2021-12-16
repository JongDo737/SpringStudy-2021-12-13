package com.spring.di;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		//뒤에 xml파일을 참조해서 context 객체를 만듬
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/di/DiBeans.xml");
		//오브젝트 형태로 가져오기 때문에 다운캐스팅 해줘야함.
		CentralController centralController = (CentralController)context.getBean("centralControl");
		centralController.onAll();
		centralController.offAll();
		//main 에서 생성하지 않았지만 DIbean에서 만든것임
		
		
		
	}

}
