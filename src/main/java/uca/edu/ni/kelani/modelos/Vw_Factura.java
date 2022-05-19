package uca.edu.ni.kelani.modelos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;
import org.springframework.data.relational.core.mapping.Embedded.Nullable;

@Entity
@Immutable
@Table(name = "vw_factura")
public class Vw_Factura {

	@Id
	private int id_factura;
	
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "id_cliente")
	private int id_cliente;
	@Column(name = "nombre_cliente")
	private String nombre_cliente;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "direccion")
	private String direccion;
	
	@Nullable
	@Column(name = "total")
	private Double total;

	public Vw_Factura(int id_factura, Date fecha, int id_cliente, String nombre_cliente, String telefono,
			String direccion, Double total) {
		super();
		this.id_factura = id_factura;
		this.fecha = fecha;
		this.id_cliente = id_cliente;
		this.nombre_cliente = nombre_cliente;
		this.telefono = telefono;
		this.direccion = direccion;
		this.total = total;
	}

	public Vw_Factura() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	
}
