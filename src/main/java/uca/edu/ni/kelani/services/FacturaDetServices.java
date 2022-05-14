package uca.edu.ni.kelani.services;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uca.edu.ni.kelani.modelos.FacturaDet;
import uca.edu.ni.kelani.repositories.FacturaDetDRepository;
import uca.edu.ni.kelani.repositories.FacturaDetIRepository;

@Service
public class FacturaDetServices implements FacturaDetIRepository{

	@Autowired
	FacturaDetDRepository frp;

	@Override
	public List<Map<String, Object>> ListarRegistro(int id) {
		// TODO Auto-generated method stub
		return frp.ListarRegistro(id);
	}

	@Override
	public int GuardarRegistro(FacturaDet c) {
		// TODO Auto-generated method stub
		return frp.GuardarRegistro(c);
	}


	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return frp.EliminarRegistro(id);
	}

	@Override
	public int EliminarRegistroByEnc(int id) {
		// TODO Auto-generated method stub
		return frp.EliminarRegistroByEnc(id);
	}
	
	

}
