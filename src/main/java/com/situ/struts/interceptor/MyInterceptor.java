package com.situ.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{
	public MyInterceptor() {
		System.out.println("MyInterceptor.MyInterceptor()");
	}

	public void destroy() {
		System.out.println("MyInterceptor.destroy()");
	}

	public void init() {
		System.out.println("MyInterceptor.init()");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("拦截器，业务处理开始");
		//调用下一个拦截器或访问Action
		String result = invocation.invoke();
		System.out.println("拦截器，业务处理结束");
		return result;
	}
}
