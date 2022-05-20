package uca.edu.ni.kelani.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uca.edu.ni.kelani.modelos.Vw_FacturaDet;
import uca.edu.ni.kelani.repositories.VwFacturaDetRepository;

@Service
public class VwFacturaDetServices{
	
	@Autowired(required=true)
	VwFacturaDetRepository vfrp;
	
	public List<Vw_FacturaDet> ListarRegistro() {
		return vfrp.findAll();
	}

}
