package com.wzy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wzy.entity.Book;
import com.wzy.util.HibernateUtil;

public class BookDao {
	public void save(Book book){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(book);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void update(Book book){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.update(book);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void saveOrUpdate(Book book){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(book);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public void delete(Book book){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.delete(book);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	public Book getById(int id){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Book b = (Book)session.get(Book.class, id);
		session.flush();
		tx.commit();
		HibernateUtil.closeSession();
		return b;
	}
}
