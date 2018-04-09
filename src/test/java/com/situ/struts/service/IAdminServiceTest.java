package com.situ.struts.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.situ.struts.entity.Admin;
import com.situ.struts.service.impl.AdminServiceImpl;

public class IAdminServiceTest {

	@Test
	public void testLogin() {
		IAdminService adminService = new AdminServiceImpl();
		Admin admin = new Admin();
		admin.setName("zs");
		admin.setPassword("123");
		Admin login = adminService.login(admin);
		System.out.println(login);
	}

}
