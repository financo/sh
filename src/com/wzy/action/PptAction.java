package com.wzy.action;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wzy.dao.BookDao;
import com.wzy.dao.PptDao;
import com.wzy.entity.Ppt;

public class PptAction extends ActionSupport{
	private String path;
	private String filename;
	private File ppt;
	private String pptFileName;
	PptDao pptDao = new PptDao();
	
	public String showPptList() throws Exception{
		ActionContext context = ActionContext.getContext();
		List<Ppt> lst = pptDao.loadAll();
		return "pptlist";
	}
	
	public java.io.InputStream getDownloadFile() throws Exception{
		InputStream in = ServletActionContext.getServletContext().getResourceAsStream(getPath());
		return in;
	}
	
	public String pptDownload() throws Exception{
		PptDao pptDao = new PptDao();
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("id");
		Ppt ppt = pptDao.getById(Integer.parseInt(id));
		filename = ppt.getName();
		path = ppt.getPath();
		return "success";
	}
	
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public File getPpt() {
		return ppt;
	}
	public void setPpt(File ppt) {
		this.ppt = ppt;
	}
	public String getPptFileName() {
		return pptFileName;
	}
	public void setPptFileName(String pptFileName) {
		this.pptFileName = pptFileName;
	}
	
	
}
