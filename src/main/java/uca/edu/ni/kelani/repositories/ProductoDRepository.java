package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uca.edu.ni.kelani.modelos.Producto;

@Repository
public class ProductoDRepository implements ProductoIRepository{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		List<Map<String, Object>> lista = template.queryForList("SELECT * FROM Producto");
		return lista;
	}

	@Override
	public int GuardarRegistro(Producto p) {
		int b = 0;
		b = template.update("INSERT INTO Producto(nombre_producto, descripcion, precio, costo, id_categoria, descripcion_categoria, id_unidad, abreviacion, estado) values(?,?,?,?,?,?,?,?,?)",
				p.getNombre_producto(), p.getDescripcion(), p.getPrecio(), p.getCosto(), p.getId_categoria(), p.getDescripcion_categoria(), p.getId_unidad(), p.getAbreviacion(), p.getEstado());
		return b;
	}

	@Override
	public int EditarRegistro(Producto p) {
		int b=0;
		b = template.update("UPDATE Producto set nombre_producto=?, descripcion=?, precio=?, costo=?, id_categoria=?, descripcion_categoria=?, id_unidad=?, abreviacion=?, estado=? WHERE id_producto=?",
				p.getNombre_producto(), p.getDescripcion(), p.getPrecio(), p.getCosto(), p.getId_categoria(), p.getDescripcion_categoria(), p.getId_unidad(), p.getAbreviacion(), p.getEstado());
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b=0;
		b = template.update("DELETE FROM Producto WHERE id_producto=?", id);
		return b;
	}
	
	

}
