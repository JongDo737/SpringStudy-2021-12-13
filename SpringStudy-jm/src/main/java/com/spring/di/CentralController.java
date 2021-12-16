package com.spring.di;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CentralController {
	@Autowired(required = true) //c1이라는 객체 녀석을 주입시켜줌 
	@Qualifier("c2")
	private RemoteControl control1;
	@Autowired(required = true)
	@Qualifier("c3")
	private RemoteControl control2;
	
	/*
	public CentralController() {
		
	}
//	<constructor-arg name="control1" ref="c1"></constructor-arg>
//	<constructor-arg name="control2" ref="c2"></constructor-arg>
//	매개변수로 각각 하나씩 주입
	public CentralController(RemoteControl control1, RemoteControl control2) {
		super();
		this.control1 = control1;
		this.control2 = control2;
	}
	

	public RemoteControl getControl1() {
		return control1;
	}


	public void setControl1(RemoteControl control1) {
		this.control1 = control1;
	}


	public RemoteControl getControl2() {
		return control2;
	}


	public void setControl2(RemoteControl control2) {
		this.control2 = control2;
	}
	*/

	public void onAll() {
		System.out.println("모든 전원을 켭니다.");
		control1.on();
		control2.on();
		
	}
	public void offAll() {
		System.out.println("모든 전원을 끕니다.");
		control1.off();
		control2.off();
		
	}
}
