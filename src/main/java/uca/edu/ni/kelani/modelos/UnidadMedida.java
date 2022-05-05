package uca.edu.ni.kelani.modelos;

public class UnidadMedida {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
