package uca.edu.ni.kelani.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "facturadet")
public class FacturaDet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_fac_detalle;
	
	private int cantidad;
	private int estado;
	private double subtotal;
	private int id_producto;
	private int id_factura;
	
	
	
	public FacturaDet(int id_fac_detalle, int cantidad, int estado, double subtotal, int id_producto, int id_factura) {
		super();
		this.id_fac_detalle = id_fac_detalle;
		this.cantidad = cantidad;
		this.estado = estado;
		this.subtotal = subtotal;
		this.id_producto = id_producto;
		this.id_factura = id_factura;
	}
	public FacturaDet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_fac_detalle() {
		return id_fac_detalle;
	}
	public void setId_fac_detalle(int id_fac_detalle) {
		this.id_fac_detalle = id_fac_detalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public int getId_factura() {
		return id_factura;
	}
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}
	
}
