package com.wzy.test;

import org.junit.Test;

import com.wzy.dao.TeacherDao;
import com.wzy.entity.Teacher;

public class testDao {


	@Test
	public void testSave() {
		TeacherDao teacherDao = new TeacherDao();
//		UserDao userDao = new UserDao();
		
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("Mr.W");
		teacher.setSex("ÄÐ");
		teacher.setDegree("master");
		teacher.setPhoto("haha");
		teacher.setPosition("wo cao");
		teacher.setIntro("jiji");
		teacher.setAddress("beijing");
		teacher.setAchievement("excellent");
		teacher.setCollege("zhengzhou");
		teacher.setEduBackground("master");
		teacher.setDirection("finance");
//		teacher.setDate("master");
//		teacher.setPath("man");

		teacherDao.save(teacher);
		
//		User user = new User();
//		user.setId(2);
//		user.setName("Mr.W");
//		user.setNum("27");
//		user.setPassword("1234");
//		userDao.save(user);
	}

}
