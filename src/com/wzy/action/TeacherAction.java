package com.wzy.action;

import com.opensymphony.xwork2.ActionContext;
import com.wzy.dao.TeacherDao;
import com.wzy.entity.Teacher;

public class TeacherAction {
	TeacherDao teacherDao = new TeacherDao();
	public String execute(){
		ActionContext context = ActionContext.getContext();
		Teacher teacher = teacherDao.getById(1);
		context.put("teacher", teacher);
		return "success";
	}
}
