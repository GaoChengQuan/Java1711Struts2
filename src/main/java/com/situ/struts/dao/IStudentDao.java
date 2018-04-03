package com.situ.struts.dao;

import java.util.List;

import com.situ.struts.entity.Student;

public interface IStudentDao {
	/**
	 * 返回所有学生信息
	 * @return
	 */
	public List<Student> findAll();
}
	
