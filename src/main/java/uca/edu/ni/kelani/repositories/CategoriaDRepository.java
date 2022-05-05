package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uca.edu.ni.kelani.modelos.Categoria;



@Repository
public class CategoriaDRepository implements CategoriaIRepository  {
	@Autowired
	JdbcTemplate operacion;
	
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("SELECT * FROM Categoria");
		return lista;
	}

	@Override
	public int GuardarRegistro(Categoria cat) {
	// TODO Auto-generated method stub
	int b = 0;
	b = operacion.update("INSERT INTO Categoria(nombre_categoria,descripcion,estado) values(?,?,?)",
			new Object[] {cat.getNombre_categoria(),cat.getDescripcion() ,cat.getEstado()});
	return b;
}

@Override
public int EditarRegistro(Categoria cat) {
	// TODO Auto-generated method stub
	int b = 0;
	b = operacion.update("UPDATE Categoria set nombre_categoria = ?, descripcion = ?,estado = ? WHERE id_categoria = ?",
			new Object[] {cat.getNombre_categoria(),cat.getDescripcion() ,cat.getEstado(), cat.getId_categoria()});
	return b;
}

@Override
public int EliminarRegistro(int id) {
	// TODO Auto-generated method stub
	int b = 0;
	b = operacion.update("UPDATE Categoria WHERE id_categoria = ?", id);
	return b;
}	
}
