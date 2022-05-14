package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import uca.edu.ni.kelani.modelos.Usuario;

public interface UsuarioIRepository {

public List<Map<String, Object>> ListarRegistro();
	
	public int GuardarRegistro(Usuario us);
	
	public int EditarRegistro(Usuario us);
	
	public int EliminarRegistro(Usuario us);
}
