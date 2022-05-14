package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uca.edu.ni.kelani.modelos.Usuario;

@Repository
public class UsuarioDRepository implements UsuarioIRepository{
	@Autowired
	JdbcTemplate operacion;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("SELECT * FROM Usuario");
		return lista;
	}

	@Override
	public int GuardarRegistro(Usuario us) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("INSERT INTO Usuario(username, pwd, nombre_real, email, estado) values(?,?,?,?,?,?)",
				new Object[] {us.getUsername(), us.getPwd(), us.getNombre_real(), us.getEmail(), us.getEstado()});
		return b;
	}

	@Override
	public int EditarRegistro(Usuario us) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("UPDATE Usuario set username = ?, pwd = ?, nombre_real = ?, email = ?, estado = ? WHERE id_usuario = ?",
				new Object[] {us.getUsername(), us.getPwd(), us.getNombre_real(), us.getEmail(), us.getEstado(), us.getId_usuario()});
		return b;
	}

	@Override
	public int EliminarRegistro(Usuario us) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("UPDATE Usuario set username = ?, pwd = ?, nombre_real = ?, email = ?, estado = ? WHERE id_usuario = ?",
				new Object[] {us.getUsername(), us.getPwd(), us.getNombre_real(), us.getEmail(), us.getEstado(), us.getId_usuario()});
		return b;
	}
}
