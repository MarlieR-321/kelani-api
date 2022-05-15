package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import uca.edu.ni.kelani.modelos.Producto;

public interface ProductoIRepository {
	
public List<Map<String, Object>> ListarRegistro();
	
	public int GuardarRegistro(Producto p);
	
	public int EditarRegistro(Producto p);
	
	public int EliminarRegistro(int id);

}
