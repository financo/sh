package com.wzy.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.wzy.dao.BookDao;
import com.wzy.entity.Book;

public class BookAction {
	BookDao bookDao = new BookDao();
	public String execute(){
		ActionContext context = ActionContext.getContext();
		List<Book> list = (List<Book>) bookDao.loadAll();
		context.put("lst", list);
		return "success";
	}
}
