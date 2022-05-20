package uca.edu.ni.kelani.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vw_producto")
public class Vw_Producto {
	
	@Id
	private int id_producto;
	
	@Column(name = "nombre_producto")
	private String nombre_producto;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "precio")
	private Double precio;
	@Column(name = "costo")
	private Double costo;
	@Column(name = "id_categoria")
	private int id_categoria;
	@Column(name = "descripcion_categoria")
	private String descripcion_categoria;
	@Column(name = "id_unidad")
	private int id_unidad;
	@Column(name = "abreviacion")
	private String abreviacion;
	
	
	
	public Vw_Producto(int id_producto, String nombre_producto, String descripcion, Double precio, Double costo,
			int id_categoria, String descripcion_categoria, int id_unidad, String abreviacion) {
		super();
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.costo = costo;
		this.id_categoria = id_categoria;
		this.descripcion_categoria = descripcion_categoria;
		this.id_unidad = id_unidad;
		this.abreviacion = abreviacion;
	}



	public Vw_Producto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId_producto() {
		return id_producto;
	}



	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}



	public String getNombre_producto() {
		return nombre_producto;
	}



	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Double getPrecio() {
		return precio;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}



	public Double getCosto() {
		return costo;
	}



	public void setCosto(Double costo) {
		this.costo = costo;
	}



	public int getId_categoria() {
		return id_categoria;
	}



	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}



	public String getDescripcion_categoria() {
		return descripcion_categoria;
	}



	public void setDescripcion_categoria(String descripcion_categoria) {
		this.descripcion_categoria = descripcion_categoria;
	}



	public int getId_unidad() {
		return id_unidad;
	}



	public void setId_unidad(int id_unidad) {
		this.id_unidad = id_unidad;
	}



	public String getAbreviacion() {
		return abreviacion;
	}



	public void setAbreviacion(String abreviacion) {
		this.abreviacion = abreviacion;
	}
	
	

}