package com.situ.struts.service.impl;

import com.situ.struts.dao.IAdminDao;
import com.situ.struts.dao.impl.AdminDaoImpl;
import com.situ.struts.entity.Admin;
import com.situ.struts.service.IAdminService;

public class AdminServiceImpl implements IAdminService {
	private IAdminDao adminDao = new AdminDaoImpl();

	public Admin login(Admin admin) {
		return adminDao.login(admin);
	}

}
