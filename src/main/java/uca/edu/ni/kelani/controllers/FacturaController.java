package uca.edu.ni.kelani.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uca.edu.ni.kelani.modelos.Factura;
import uca.edu.ni.kelani.modelos.Vw_Factura;
import uca.edu.ni.kelani.services.FacturaDetServices;
import uca.edu.ni.kelani.services.FacturaServices;


@RestController
@RequestMapping(path="/factura")
public class FacturaController {

	@Autowired
	FacturaServices facS;
	
	@Autowired
	FacturaDetServices facDS;
	
	
	@GetMapping(path="/listar")
	public List<Vw_Factura> listar() {
		return facS.ListarRegistro();		
	}
	
	@PostMapping(path="/add")
	public ResponseEntity<Factura> insert(@RequestBody Factura c) {
		return ResponseEntity.ok(facS.GuardarRegistro(c));
	}

	@DeleteMapping(path="/delete/{id}")
	public ResponseEntity<Void> EliminarRegistro(@PathVariable int id) throws Exception  {
		facS.EliminarRegistro(id);
		return ResponseEntity.notFound().build();
	}

}
