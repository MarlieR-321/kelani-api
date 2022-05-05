package uca.edu.ni.kelani.modelos;

public class FacturaDet {

	private int id_factura_det;
	private int cantidad;
	private double subtotal;
	private int id_producto;
	private int id_factura;
	private int estado;
	
	public FacturaDet(int id_factura_det, int cantidad,Double subtotal,int id_producto,int id_factura,int estado) {
		this.id_factura_det = id_factura_det;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.id_producto = id_producto;
		this.id_factura = id_factura;
		this.estado = estado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getId_factura_det() {
		return id_factura_det;
	}

	public void setId_factura_det(int id_factura_det) {
		this.id_factura_det = id_factura_det;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
