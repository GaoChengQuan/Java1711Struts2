package com.situ.struts.controller;

import java.util.Date;

public class UserAction {
	//封装请求数据，set必须要写，get可以不写
	private String name;
	private Integer age;
	private Date birthday;
	
	public UserAction() {
		System.out.println("UserAction.UserAction()");
	}

	public String register() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(birthday);
		return "success";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
