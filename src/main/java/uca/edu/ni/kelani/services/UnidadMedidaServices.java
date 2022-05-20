package uca.edu.ni.kelani.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uca.edu.ni.kelani.modelos.Factura;
import uca.edu.ni.kelani.modelos.UnidadMedida;
import uca.edu.ni.kelani.modelos.Vw_Factura;
import uca.edu.ni.kelani.repositories.ClienteDRepository;
import uca.edu.ni.kelani.repositories.UnidadMedidaRepository;

@Service
public class UnidadMedidaServices  {

	@Autowired(required=true)
	UnidadMedidaRepository um;
	
	

	public List<UnidadMedida> ListarRegistro() {
		return um.findAll();
	}

	public UnidadMedida GuardarRegistro(UnidadMedida c) {
		return um.save(c);
	}


	public void EliminarRegistro(int id) {
		um.deleteById(id);
	}

}