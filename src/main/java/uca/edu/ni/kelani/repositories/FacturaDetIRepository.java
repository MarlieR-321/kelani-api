package uca.edu.ni.kelani.repositories;

import java.util.List;
import java.util.Map;
import uca.edu.ni.kelani.modelos.FacturaDet;

public interface FacturaDetIRepository {

	public List<Map<String, Object>> ListarRegistro(int id);
	
	public int GuardarRegistro(FacturaDet c);
	
	public int EliminarRegistro(int id);
	
	public int EliminarRegistroByEnc(int id);
}
