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
	public int EliminarRegistro(int id) {
		int b=0;
		b = template.update("DELETE FROM FacturaDet WHERE id_fac_detalle=?",
				id);
		return b;
	}
	
	@Override
	public int EliminarRegistroByEnc(int id) {
		int b=0;
		b = template.update("DELETE FROM FacturaDet WHERE id_factura=?",
				id);
		return b;
	}

}
