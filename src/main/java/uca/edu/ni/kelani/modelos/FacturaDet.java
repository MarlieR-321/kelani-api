package uca.edu.ni.kelani.modelos;

import javax.persistence.Column;
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
	@Column(name = "id_fac_detalle")
	private int id_fac_detalle;
	
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "estado")
	private int estado;
	@Column(name = "subtotal")
	private double subtotal;
	@Column(name = "id_producto")
	private int id_producto;
	@Column(name = "id_factura")
	private int id_factura;
	
	
	
	
}
