package uca.edu.ni.kelani.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uca.edu.ni.kelani.modelos.Factura;
import uca.edu.ni.kelani.modelos.Vw_Factura;
import uca.edu.ni.kelani.repositories.FacturaRepository;
import uca.edu.ni.kelani.repositories.VwFacturaRepository;

@Service
public class FacturaServices{

	@Autowired(required=true)
	FacturaRepository frp;
	
	@Autowired(required=true)
	VwFacturaRepository vfrp;

	
	public List<Vw_Factura> ListarRegistro() {
		return vfrp.findAll();
	}

	public Factura GuardarRegistro(Factura c) {
		return frp.save(c);
	}


	public void EliminarRegistro(int id) {
		frp.deleteById(id);
	}

}
