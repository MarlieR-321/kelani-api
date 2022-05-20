package uca.edu.ni.kelani.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Categoria {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_categoria;
	private String nombre_categoria;
	private String descripcion;
	private int estado;
	
	
	
	public Categoria(int id_categoria, String nombre_categoria, String descripcion, int estado) {
	
		this.id_categoria = id_categoria;
		this.nombre_categoria = nombre_categoria;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	

	
}
