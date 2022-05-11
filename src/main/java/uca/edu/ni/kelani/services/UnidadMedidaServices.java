package uca.edu.ni.kelani.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uca.edu.ni.kelani.modelos.UnidadMedida;
import uca.edu.ni.kelani.repositories.ClienteDRepository;
import uca.edu.ni.kelani.repositories.UnidadMedidaIRepository;
import uca.edu.ni.kelani.repositories.UnidadMedidadDRepository;

@Service
public class UnidadMedidaServices  implements UnidadMedidaIRepository{

	@Autowired
	UnidadMedidadDRepository um;
	
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return um.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(UnidadMedida umd) {
		// TODO Auto-generated method stub
		return um.GuardarRegistro(umd);
	}

	@Override
	public int EditarRegistro(UnidadMedida umd) {
		// TODO Auto-generated method stub
		return um.EditarRegistro (umd);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return um.EliminarRegistro(id);
	}

	
	
}
