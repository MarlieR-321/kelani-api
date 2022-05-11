package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;

import uca.edu.ni.kelani.modelos.Cliente;

public interface ClienteIRepository {

public List<Map<String, Object>> ListarRegistro();
	
	public int GuardarRegistro(Cliente cl);
	
	public int EditarRegistro(Cliente cl);
	
	public int EliminarRegistro(Cliente cl);
}
