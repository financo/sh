package com.wzy.action;

import com.opensymphony.xwork2.ActionContext;
import com.wzy.dao.FirstpageDao;

public class FirstpageAction {
	FirstpageDao firstpageDao = new FirstpageDao();
	public String execute(){
		ActionContext context = ActionContext.getContext();
		String content = firstpageDao.getById(1).getDescription();
		context.put("description", content);
		return "success";
	}
}
