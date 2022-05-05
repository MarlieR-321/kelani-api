package uca.edu.ni.kelani.modelos;

public class Producto {

	private int id_producto;
	private String nombre_producto;
	private String descripcion;
	private double precio;
	private double costo;
	private int id_categoria;
	private int id_unidad;
	private int estado;
	
	
	public Producto(int id_producto, String nombre_producto, String descripcion,Double precio,Double costo,int id_categoria,int id_unidad,int estado) {
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.costo = costo;
		this.id_categoria = id_categoria;
		this.id_unidad = id_unidad;
		this.estado = estado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public int getId_unidad() {
		return id_unidad;
	}

	public void setId_unidad(int id_unidad) {
		this.id_unidad = id_unidad;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	
}
