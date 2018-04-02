package com.situ.struts.data;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DataAction2 extends ActionSupport implements RequestAware, SessionAware, ApplicationAware{
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;

	@Override
	public String execute() throws Exception {
		System.out.println("DataAction12.execute()");
		// 1. 得到参数，封装数据
		// 2. 调用Service处理业务逻辑，拿到结果数据
		// 3. 把数据保存到域中
		request.put("request_data3", "request_data3");
		session.put("session_data3", "session_data3");
		application.put("application_data3", "application_data3");
		
		return "success";
	}

	//struts运行的时候，会把代表application的map对象注入
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
}
