package com.situ.struts.login;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.situ.struts.entity.Admin;
import com.situ.struts.entity.Student;
import com.situ.struts.service.IAdminService;
import com.situ.struts.service.IStudentService;
import com.situ.struts.service.impl.AdminServiceImpl;
import com.situ.struts.service.impl.StudentServiceImpl;

public class AdminAction extends ActionSupport{
	private Admin admin;
	private IAdminService adminService = new AdminServiceImpl();
	private IStudentService studentService = new StudentServiceImpl();
	
	public String login() {
		Admin adminLogin = adminService.login(admin);
		//登录失败
		if (adminLogin == null) {
			return "loginFail";
		}
		
		//登录成功:数据保存到session
		ActionContext actionContext = ActionContext.getContext();
		ActionContext.getContext().getSession().put("admin", adminLogin);
		//返回登录成功
		return "loginSuccess";
	}
	
	public String list() {
		List<Student> list = studentService.findAll();
		//保存到request域对象中
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> contextMap = actionContext.getContextMap();
		contextMap.put("list", list);
		return "list";
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}
