package com.situ.struts.login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CheckLoginIntercepotor extends AbstractInterceptor{
	
	/**
	 * 拦截器业务处理方法
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//如果已经登录，放行（访问下一个拦截器或者是Action）
		//如果没有登录，转发到登录界面
		//特殊情况处理：拿到当前执行的方法名：判断只有当前方法名不是login才进行验证
		
		//获得ActionContext对象
		ActionContext actionContext = invocation.getInvocationContext();
		//获得Action的代理类
		ActionProxy proxy = invocation.getProxy();
		//获得当前执行的方法名
		String methodName = proxy.getMethod();
		//判断
		if (!"login".equals(methodName)) {//需要验证方法
			//查看session有没有登录的用户
			Object object = actionContext.getSession().get("admin");
			if (object == null) {
				return "input";
			}
		}
		
		//访问下一个拦截器或者Action
		return invocation.invoke();
	}
}
