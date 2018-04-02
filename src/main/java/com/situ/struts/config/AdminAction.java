package com.situ.struts.config;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{

	public String delete() throws Exception {
		return "success";
	}
	
	public String add() {
		System.out.println("AdminAction.add()");
		return "add";
	}
	
}
