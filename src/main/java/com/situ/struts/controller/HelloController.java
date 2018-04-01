package com.situ.struts.controller;

import com.opensymphony.xwork2.ActionSupport;

public class HelloController extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("HelloController.execute()");
		return "success";
	}
}
