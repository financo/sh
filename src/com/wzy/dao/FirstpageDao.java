package com.wzy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wzy.entity.Firstpage;
import com.wzy.util.HibernateUtil;

public class FirstpageDao {
	public void save(Firstpage firstpage){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(firstpage);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void update(Firstpage firstpage){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.update(firstpage);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void saveOrUpdate(Firstpage firstpage){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(firstpage);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void delete(Firstpage firstpage){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.delete(firstpage);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public Firstpage getById(int id){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Firstpage f = (Firstpage)session.get(Firstpage.class, id);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
		return f;
	}
}
