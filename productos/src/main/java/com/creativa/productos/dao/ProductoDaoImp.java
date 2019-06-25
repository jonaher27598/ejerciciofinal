package com.creativa.productos.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.creativa.productos.config.hibernateConfig;
import com.creativa.productos.model.Producto;

@Repository
public class ProductoDaoImp {
	@Autowired
	private SessionFactory sessionFactory;

	public void addproc(Producto p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(p);
	}
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Producto> list() {
		Session session = hibernateConfig.getSessionFactory().openSession();
		List<Producto> catelist = session.createQuery("from Producto").list();

		return catelist;
	}
}
