package com.situ.struts.service.impl;

import java.util.List;

import com.situ.struts.dao.IStudentDao;
import com.situ.struts.dao.impl.StudentDaoImpl;
import com.situ.struts.entity.Student;
import com.situ.struts.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao studentDao = new StudentDaoImpl();
	
	public List<Student> findAll() {
		return studentDao.findAll();
	}

}
