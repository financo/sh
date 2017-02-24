package com.wzy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wzy.entity.Teacher;
import com.wzy.util.HibernateUtil;

public class TeacherDao {
	public void save(Teacher teacher){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(teacher);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void update(Teacher teacher){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.update(teacher);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void saveOrUpdate(Teacher teacher){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(teacher);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void delete(Teacher teacher){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.delete(teacher);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public Teacher getById(int id){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Teacher t=(Teacher)session.get(Teacher.class, id);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
		return t;
	}
}
