package com.creativa.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.creativa.productos.dao.ProductoDaoImp;
import com.creativa.productos.model.Producto;


@Service
@Transactional
public class productoService {
	@Autowired
	ProductoDaoImp procdao;

	public List<Producto> listarpro(){
		return procdao.list();
	}
}
