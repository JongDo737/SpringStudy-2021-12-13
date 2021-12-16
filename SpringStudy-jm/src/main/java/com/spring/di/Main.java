package com.spring.di;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CentralController2 centralController = new CentralController2();
		while(true) {
			System.out.println("1. 리모컨 추가");
			System.out.println("2. 모든 전원 켜기");
			System.out.println("3. 모든 전원 끄기");
			System.out.println("0. 프로그램 종료");
			System.out.println("명령을 선택해 주세요.");
			int select = sc.nextInt();
			sc.nextLine();
			
			if (select == 1) {
				centralController.addController();
			} else if (select == 2) {
				centralController.onAll();
				
			} else if (select == 3) {
				centralController.offAll();
			} else if (select == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 명령어 입니다.");
			}
			
		}

	}

}
