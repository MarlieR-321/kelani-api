package uca.edu.ni.kelani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uca.edu.ni.kelani.modelos.FacturaDet;
import uca.edu.ni.kelani.repositories.FacturaDetRepository;

@Service
public class FacturaDetServices {
	@Autowired
	FacturaDetRepository frp;

	public FacturaDet GuardarRegistro(FacturaDet c) {
		return frp.save(c);
	}


	public void EliminarRegistro(int id) {
		frp.deleteById(id);
	}

}
