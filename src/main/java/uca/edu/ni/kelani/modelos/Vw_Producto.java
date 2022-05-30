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
	
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "precio")
	private Double precio;
	@Column(name = "costo")
	private Double costo;
	@Column(name = "id_unidad")
	private int id_unidad;
	@Column(name = "nombre_unidad")
	private String nombre_unidad;
	@Column(name = "abreviatura")
	private String abreviacion;
	@Column(name = "id_categoria")
	private int id_categoria;
	@Column(name = "nombre_categoria")
	private String nombre_categoria;
	@Column(name = "descripcion_categoria")
	private String descripcion_categoria;
	



	public Vw_Producto(int id_producto, String nombre, String descripcion, Double precio, Double costo,
			int id_unidad, String nombre_unidad, String abreviacion, int id_categoria, String nombre_categoria, String descripcion_categoria) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.costo = costo;
		this.id_unidad = id_unidad;
		this.nombre_unidad = nombre_unidad;
		this.abreviacion = abreviacion;
		this.id_categoria = id_categoria;
		this.nombre_categoria = nombre_categoria; 
		this.descripcion_categoria = descripcion_categoria;
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



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
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



	public int getId_unidad() {
		return id_unidad;
	}



	public void setId_unidad(int id_unidad) {
		this.id_unidad = id_unidad;
	}



	public String getNombre_unidad() {
		return nombre_unidad;
	}



	public void setNombre_unidad(String nombre_unidad) {
		this.nombre_unidad = nombre_unidad;
	}



	public String getAbreviacion() {
		return abreviacion;
	}



	public void setAbreviacion(String abreviacion) {
		this.abreviacion = abreviacion;
	}



	public int getId_categoria() {
		return id_categoria;
	}



	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}



	public String getNombre_categoria() {
		return nombre_categoria;
	}



	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}



	public String getDescripcion_categoria() {
		return descripcion_categoria;
	}



	public void setDescripcion_categoria(String descripcion_categoria) {
		this.descripcion_categoria = descripcion_categoria;
	}



	
	
	

}
