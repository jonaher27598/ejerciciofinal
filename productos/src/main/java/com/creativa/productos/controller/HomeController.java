package com.creativa.productos.controller;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.creativa.productos.dao.AtributoDaoImp;
import com.creativa.productos.dao.CategoriaDaoImp;
import com.creativa.productos.dao.ProductoDaoImp;
import com.creativa.productos.model.Producto;
import com.creativa.productos.service.productoService;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String userForm(Model model) {
		ProductoDaoImp proc = new ProductoDaoImp();
//		List<Producto> catelist = proc.list();
		model.addAttribute("listar", proc.list());
		return "lista";
	}	

	

	

	

	@RequestMapping("/nuevo")
	public String guardar(Model model) {
		CategoriaDaoImp cat = new CategoriaDaoImp();
		model.addAttribute("categoria", cat.list());
		AtributoDaoImp atb = new AtributoDaoImp();
		model.addAttribute("atributo", atb.list());
		return "insert";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("proc") Producto p) {
		ProductoDaoImp proc = new ProductoDaoImp();
		proc.addproc(p);
		return "redirect:/persons";
	}
}