package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;
import uca.edu.ni.kelani.modelos.Factura;

public interface FacturaIRepository {

	public List<Map<String, Object>> ListarRegistro();
	
	public int GuardarRegistro(Factura c);
	
	public int EditarRegistro(Factura c);
	
	public int EliminarRegistro(int id);
}
