package com.spring.di;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		CentralController2 centralController = new CentralController2();
		
		while(true) {
			System.out.println("1. 리모컨 추가");
			System.out.println("2. 모든 전원 켜기");
			System.out.println("3. 모든 전원 끄기");
			System.out.println("0. 프로그램 종료");
			System.out.print("명령을 선택해 주세요: ");
			int select = in.nextInt();
			in.nextLine();
			
			if(select == 1) {
				centralController.addController();
			}else if(select == 2) {
				centralController.onAll();
			}else if(select == 3) {
				centralController.offAll();
			}else if(select == 0) {
				System.out.println("프로그램 종료중...");
				break;
			}else {
				System.out.println("잘 못 된 명령어 입니다.");
			}
		}
		
		
	}

}
