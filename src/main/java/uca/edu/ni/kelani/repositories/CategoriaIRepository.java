package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import uca.edu.ni.kelani.modelos.Categoria;

public interface CategoriaIRepository {
	

public List<Map<String, Object>> ListarRegistro();
	
	public int GuardarRegistro(Categoria cl);
	
	public int EditarRegistro(Categoria cl);
	
	public int EliminarRegistro(int id);
}
