package com.creativa.productos.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.creativa.productos.model.Producto;

@Entity
@Table(name = "atributos")
public class Atributos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idatrib")
	private int id;

	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "atributo")
	private Set<Producto> producto;

	public Set<Producto> getProducto() {
		return producto;
	}

	public void setProducto(Set<Producto> producto) {
		this.producto = producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Atributos [id=" + id + ", nombre=" + nombre + "]";
	}

}
