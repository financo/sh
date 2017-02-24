package com.wzy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wzy.entity.User;
import com.wzy.util.HibernateUtil;

public class UserDao {
	public void save(User user){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void update(User user){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.update(user);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void saveOrUpdate(User user){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(user);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void delete(User user){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.delete(user);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public User getById(int id){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		User u = (User)session.get(User.class, id);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
		return u;
	}
}
