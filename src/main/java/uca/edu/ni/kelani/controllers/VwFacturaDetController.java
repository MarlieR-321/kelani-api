package uca.edu.ni.kelani.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uca.edu.ni.kelani.modelos.Factura;
import uca.edu.ni.kelani.modelos.Vw_Factura;
import uca.edu.ni.kelani.modelos.Vw_FacturaDet;
import uca.edu.ni.kelani.services.FacturaDetServices;
import uca.edu.ni.kelani.services.FacturaServices;
import uca.edu.ni.kelani.services.VwFacturaDetServices;
import uca.edu.ni.kelani.services.VwFacturaServices;


@RestController
@RequestMapping(path="/fdetalle")
public class VwFacturaDetController {

	@Autowired
	VwFacturaDetServices facS;
	
	@GetMapping(path="/listar")
	public List<Vw_FacturaDet> listar() {
		return facS.ListarRegistro();		
	}

}
