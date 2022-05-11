package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uca.edu.ni.kelani.modelos.Factura;

@Repository
public class FacturaDRepository implements FacturaIRepository{

	@Autowired
	JdbcTemplate template;
	
	public FacturaDRepository() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		List<Map<String, Object>> lista  = template.queryForList("SELECT * FROM Factura");
		return lista;
	}

	@Override
	public int GuardarRegistro(Factura c) {
		int b =0;
		b= template.update("INSERT INTO Factura(fecha,total,id_cliente,direccion,telefono,estado) values(?,?,?,?,?,?)",
				c.getFecha(),c.getTotal(),c.getId_cliente(),c.getDireccion(),c.getTelefono(),c.getEstado());
		return b;
	}

	@Override
	public int EditarRegistro(Factura c) {
		int b=0;
		b = template.update("UPDATE Factura set fecha=?,total=?,id_cliente=?,direccion=?,telefono=?,estado=? WHERE id_factura=?",
				c.getFecha(),c.getTotal(),c.getId_cliente(),c.getDireccion(),c.getTelefono(),c.getEstado(),c.getId_factura());
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b=0;
		b = template.update("DELETE FROM Factura WHERE id_factura=?",
				id);
		return b;
	}

}
