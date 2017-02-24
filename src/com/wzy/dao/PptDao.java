package com.wzy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wzy.entity.Ppt;
import com.wzy.util.HibernateUtil;

public class PptDao {
	public void save(Ppt ppt){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(ppt);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void update(Ppt ppt){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.update(ppt);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void saveOrUpdate(Ppt ppt){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(ppt);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void delete(Ppt ppt){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.delete(ppt);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public Ppt getById(String id){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Ppt p = (Ppt)session.get(Ppt.class, id);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
		return p;
	}
}
