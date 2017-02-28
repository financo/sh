package com.wzy.action;

import com.opensymphony.xwork2.ActionContext;
import com.wzy.dao.UserDao;
import com.wzy.entity.User;

public class UserAction {
	UserDao userDao = new UserDao();
	public String execute(){
		ActionContext context = ActionContext.getContext();
		User user = userDao.getById(1);
		if("1234"==user.getPassword()&&"Mr.W"==user.getName()){
			context.put("user", user);
			return "success";
		}
		return "something wrong!";
	}
}
