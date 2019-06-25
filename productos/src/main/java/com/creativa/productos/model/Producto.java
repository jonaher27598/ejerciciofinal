package com.creativa.productos.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.creativa.productos.model.Categoria;
import com.creativa.productos.model.Atributos;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idprod")
	private int idprod;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name ="cantidad")
	private int cantidad;
	
	@Column(name = "precio")
	private double precio;
	
	@ManyToOne
	@JoinColumn(name = "categoria")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "atributos")
	private Atributos atributo;
	

	@Column(name = "attrib")
	private String atrib;

	public int getIdprod() {
		return idprod;
	}

	public void setIdprod(int idprod) {
		this.idprod = idprod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Atributos getAtributos() {
		return atributo;
	}

	public void setAtributos(Atributos atributos) {
		this.atributo = atributos;
	}

	public String getAtrib() {
		return atrib;
	}

	public void setAtrib(String atrib) {
		this.atrib = atrib;
	}
}

	