package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uca.edu.ni.kelani.modelos.Cliente;

@Repository
public class ClienteDRepository implements ClienteIRepository{
	@Autowired
	JdbcTemplate operacion;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("SELECT * FROM Cliente");
		return lista;
	}

	@Override
	public int GuardarRegistro(Cliente cl) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("INSERT INTO Cliente(cedula, direccion, telefono, nombre, apellido, email, estado) values(?,?,?,?,?,?,?)",
				new Object[] {cl.getCedula(), cl.getDireccion(), cl.getTelefono(), cl.getNombre(), cl.getApellido(), cl.getEmail(), cl.getEstado()});
		return b;
	}

	@Override
	public int EditarRegistro(Cliente cl) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("UPDATE Cliente set cedula = ?, direccion = ?, telefono = ?, nombre = ?, apellido = ?, email = ?, estado = ? WHERE id_cliente = ?",
				new Object[] {cl.getCedula(), cl.getDireccion(), cl.getTelefono(), cl.getNombre(), cl.getApellido(), cl.getEmail(), cl.getEstado(), cl.getId_cliente()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("UPDATE Cliente WHERE id_cliente = ?", id);
		return b;
	}	
}
