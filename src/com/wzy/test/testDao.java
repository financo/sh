package com.wzy.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.wzy.dao.PptDao;
import com.wzy.entity.Ppt;

public class testDao {


	@Test
	public void testSave() {
		PptDao teacherDao = new PptDao();
//		UserDao userDao = new UserDao();
		
		Ppt teacher = new Ppt();
		teacher.setId(1);
		teacher.setName("Mr.W");
//		teacher.setPhoto("haha");
//		teacher.setPosition("wo cao");
//		teacher.setIntro("jiji");
//		teacher.setAddress("beijing");
//		teacher.setAchievement("excellent");
//		teacher.setCollege("zhengzhou");
//		teacher.setEduBackground("master");
		teacher.setDate("master");
		teacher.setPath("man");

		teacherDao.save(teacher);
		
//		User user = new User();
//		user.setId(2);
//		user.setName("Mr.W");
//		user.setNum("27");
//		user.setPassword("1234");
//		userDao.save(user);
	}

}
