package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uca.edu.ni.kelani.modelos.FacturaDet;

@Repository
public class FacturaDetDRepository implements FacturaDetIRepository{

	@Autowired
	JdbcTemplate template;
	
	public FacturaDetDRepository() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Map<String, Object>> ListarRegistro(int id) {
		List<Map<String, Object>> lista  = template.queryForList("Select * from FacturaDet where estado<>3 and id_factura=?",id);
		return lista;
	}

	@Override
	public int GuardarRegistro(FacturaDet c) {
		int b =0;
		b= template.update("INSERT INTO FacturaDet(id_producto,cantidad,subtotal,id_factura,estado) values(?,?,?,?,?)",
				c.getId_producto(),c.getCantidad(),c.getSubtotal(),c.getId_factura(),c.getEstado());
		return b;
	}

	@Override
	public int EditarRegistro(FacturaDet c) {
		int b=0;
		b = template.update("UPDATE FacturaDet set id_producto=?,cantidad=?,subtotal=?,id_factura=?,estado=? WHERE id_fac_detalle=?",
				c.getId_producto(),c.getCantidad(),c.getSubtotal(),c.getId_factura(),c.getEstado(),c.getId_factura_det());
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b=0;
		b = template.update("UPDATE FacturaDet set estado=3 WHERE id_fac_detalle=?",
				id);
		return b;
	}

}
