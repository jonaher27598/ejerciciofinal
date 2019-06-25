package com.creativa.productos.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.creativa.productos.config.hibernateConfig;
import com.creativa.productos.model.Categoria;




@Repository
@Transactional
public class CategoriaDaoImp  {

	@Autowired
	   private SessionFactory sessionFactory;

	
	public void addcat(Categoria c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
	}

	@SuppressWarnings("unchecked")
	public List<Categoria> list() {
		Session session = hibernateConfig.getSessionFactory().openSession();
		List<Categoria> catelist = session.createQuery("from Categoria").list();

		return catelist;
	}
	
}
