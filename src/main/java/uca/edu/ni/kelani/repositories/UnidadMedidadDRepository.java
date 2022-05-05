package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uca.edu.ni.kelani.modelos.UnidadMedida;



public class UnidadMedidadDRepository implements UnidadMedidaIRepository {
	
	@Autowired
	JdbcTemplate operacion;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("SELECT * FROM UnidadMedida");
		return lista;
	}

	@Override
	public int GuardarRegistro(UnidadMedida um) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("INSERT INTO UnidadMedida(nombre.abreviatura, estado) values(?,?,?)",
				new Object[] {um.getNombre_unidad(),um.getAbreviatura(), um.getEstado()});
		return b;
	}

	@Override
	public int EditarRegistro(UnidadMedida um) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("UPDATE Cliente set nombre = ?, abreviatura = ?,estado = ? WHERE id_unidad = ?",
				new Object[]  {um.getNombre_unidad(),um.getAbreviatura(), um.getEstado(), um.getId_unidad()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("UPDATE UnidadMedida WHERE id_unidad = ?", id);
		return b;
	}

	
}
