package com.spring.di;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CentralController2 {
	private List<RemoteControl> controls;
	private Scanner in;
	
	public CentralController2() {
		controls = new ArrayList<RemoteControl>();
		in = new Scanner(System.in);
	}
	
	public void addController() {
		RemoteControl remoteControl;
	
		System.out.print("회사명을 입력해 주세요: ");
		String company = in.nextLine();
		while(true) {
			System.out.print("리모컨의 종류를 선택해 주세요: ");
			int remote = in.nextInt();
			in.nextLine();
			if(remote == 1) {
				// TV
				//remoteControl = new TvRemoteControl(company);
				break;
			}else if(remote == 2) {
				// 에어컨
				//remoteControl = new AirConditionerRemoteControl(company);
				break;
			}else {
				System.out.println("지원하지 않는 리모컨입니다.");
			}
		}
		
		//controls.add(remoteControl);
	}
	
	public void onAll() {
		System.out.println("모든 전원을 켭니다.");
		for(RemoteControl control : controls) {
			control.on();
		}
	}
	
	public void offAll() {
		System.out.println("모든 전원을 끕니다.");
		for(RemoteControl control : controls) {
			control.off();
		}
	}
	
}
