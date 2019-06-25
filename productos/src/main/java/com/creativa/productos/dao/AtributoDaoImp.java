package com.creativa.productos.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.creativa.productos.config.hibernateConfig;
import com.creativa.productos.model.Categoria;




@Repository
public class AtributoDaoImp  {
	@Autowired
	   private SessionFactory sessionFactory;


	public void addcat(Categoria c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
	}

	@SuppressWarnings("unchecked")
	public List<Categoria> list() {
		Session session = hibernateConfig.getSessionFactory().openSession();
		List<Categoria> catelist = session.createQuery("from Atributo").list();

		return catelist;
	}
	
}
