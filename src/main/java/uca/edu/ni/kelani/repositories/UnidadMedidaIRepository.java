package uca.edu.ni.kelani.repositories;


import java.util.List;
import java.util.Map;


import uca.edu.ni.kelani.modelos.UnidadMedida;

public interface UnidadMedidaIRepository {

public List<Map<String, Object>> ListarRegistro();
	
	public int GuardarRegistro(UnidadMedida um);
	
	public int EditarRegistro(UnidadMedida um);
	
	public int EliminarRegistro(int id);
}