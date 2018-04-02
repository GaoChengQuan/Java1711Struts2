package com.situ.struts.controller;

import com.situ.struts.entity.User;

public class UserAction2 {
	//对象类型，一定加上get方式
	private User user;

	public String register() {
		System.out.println(user);
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
