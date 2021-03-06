package uca.edu.ni.kelani.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uca.edu.ni.kelani.modelos.Factura;
import uca.edu.ni.kelani.services.FacturaServices;


@RestController
@RequestMapping(path="/factura")
public class FacturaController {

	@Autowired
	FacturaServices facS;
	
	@PostMapping(path="/add")
	public Factura insert(@RequestBody Factura c) {
		return facS.GuardarRegistro(c);
	}

	@DeleteMapping(path="/delete/{id}")
	public void EliminarRegistro(@PathVariable int id) {
		facS.EliminarRegistro(id);
	}

}
