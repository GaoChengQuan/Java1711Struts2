package com.situ.struts.upload;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.situ.struts.entity.User;

public class FileUploadAction extends ActionSupport {
	private User user;

	// 文件上传：<input type="file" name="fileUp"/><br/>
	private File fileUp;
	// 文件名(要求必须后面是FileName)
	private String fileUpFileName;
	// 文件的类型（MIME）(要求必须后面是ContentType)
	private String fileUpContentType;

	@Override
	public String execute() throws Exception {
		System.out.println(user);
		//获取上传的目录路径upload
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		//在指定的目录下面创建文件(在指定路径下面创建指定文件名的文件)
		File destFile = new File(path, fileUpFileName);
		//把上传的文件，拷贝到目标文件中
		FileUtils.copyFile(fileUp, destFile);
		
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setFileUp(File fileUp) {
		this.fileUp = fileUp;
	}

	public void setFileUpFileName(String fileUpFileName) {
		this.fileUpFileName = fileUpFileName;
	}

	public void setFileUpContentType(String fileUpContentType) {
		this.fileUpContentType = fileUpContentType;
	}

}
