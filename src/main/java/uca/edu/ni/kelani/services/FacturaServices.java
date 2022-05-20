package uca.edu.ni.kelani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uca.edu.ni.kelani.modelos.Factura;
import uca.edu.ni.kelani.repositories.FacturaRepository;

@Service
public class FacturaServices{

	@Autowired(required=true)
	FacturaRepository frp;
	
	

	public Factura GuardarRegistro(Factura c) {
		return frp.save(c);
	}


	public void EliminarRegistro(int id) {
		frp.deleteById(id);
	}

}
