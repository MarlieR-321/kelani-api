package uca.edu.ni.kelani.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "UnidadMedida")
public class UnidadMedida {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_unidad;
	private String nombre_unidad;
	private String abreviatura;
	private int estado;
	
	
	public UnidadMedida(int id_unidad, String nombre_unidad, String abreviatura, int estado) {
		this.id_unidad = id_unidad;
		this.nombre_unidad = nombre_unidad;
		this.abreviatura = abreviatura;
		this.estado = estado;
	}

	public UnidadMedida() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

	
}
