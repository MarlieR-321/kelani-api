package uca.edu.ni.kelani.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vw_facturadet")
public class Vw_FacturaDet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fac_detalle")
	private int id_fac_detalle;
	
	@Column(name = "id_producto")
	private int id_producto;
	
	@Column(name = "id_factura")
	private int id_factura;
	
	@Column(name = "producto")
	private String producto;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "subtotal")
	private double subtotal;

	public Vw_FacturaDet(int id_fac_detalle, int id_producto, int id_factura, String producto, double precio,
			int cantidad, double subtotal) {
		super();
		this.id_fac_detalle = id_fac_detalle;
		this.id_producto = id_producto;
		this.id_factura = id_factura;
		this.producto = producto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}

	public Vw_FacturaDet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getId_fac_detalle() {
		return id_fac_detalle;
	}

	public void setId_fac_detalle(int id_fac_detalle) {
		this.id_fac_detalle = id_fac_detalle;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
//U20Marlie12169#
	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	
}
