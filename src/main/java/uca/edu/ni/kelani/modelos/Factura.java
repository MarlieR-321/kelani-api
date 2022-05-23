package uca.edu.ni.kelani.modelos;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_factura;
	private int estado;
	private String fecha;
	private double total;
	private int id_cliente;
	private String direccion;
	private String telefono;
	
	
	
	public Factura(int id_factura, int estado, String fecha, double total, int id_cliente, String direccion,
			String telefono) {
		super();
		this.id_factura = id_factura;
		this.estado = estado;
		this.fecha = fecha;
		this.total = total;
		this.id_cliente = id_cliente;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId_factura() {
		return id_factura;
	}
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
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
