package com.wzy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wzy.entity.Admin;
import com.wzy.util.HibernateUtil;

public class AdminDao {
	public void save(Admin admin){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(admin);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void update(Admin admin){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.update(admin);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void saveOrUpdate(Admin admin){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(admin);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void delete(Admin admin){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.delete(admin);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public Admin getById(String id){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Admin a = (Admin)session.get(Admin.class, id);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
		return a;
	}
}
