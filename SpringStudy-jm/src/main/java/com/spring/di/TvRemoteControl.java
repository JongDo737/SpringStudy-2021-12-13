package com.spring.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("c2")
public class TvRemoteControl implements RemoteControl {

	@Value("LG")
	private String company;

	public TvRemoteControl() {
	}

	public TvRemoteControl(String company) {
		super();
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void on() {
		System.out.println(company + "TV의 전원을 켭니다.");
	}

	@Override
	public void off() {
		System.out.println(company + "TV의 전원을 끕니다.");
	}

}
