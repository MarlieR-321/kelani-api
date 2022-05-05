package uca.edu.ni.kelani.modelos;

import java.sql.Date;

public class Factura {

	private int id_factura;
	private Date fecha;
	private double total;
	private int id_cliente;
	private int estado;
	private String direccion;
	private String telefono;
	
	
	public Factura(int id_factura, Date fecha,Double total,int id_cliente,int estado, String direccion,String telefono) {
		this.id_factura = id_factura;
		this.fecha = fecha;
		this.total = total;
		this.id_cliente = id_cliente;
		this.estado = estado;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getId_factura() {
		return id_factura;
	}

	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
