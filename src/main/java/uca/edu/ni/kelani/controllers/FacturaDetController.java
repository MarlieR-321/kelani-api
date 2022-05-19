package uca.edu.ni.kelani.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uca.edu.ni.kelani.modelos.FacturaDet;
import uca.edu.ni.kelani.services.FacturaDetServices;


@RestController
@RequestMapping(path="/fdetalle")
public class FacturaDetController {

	@Autowired
	FacturaDetServices facS;
	
	@GetMapping(path="/list")
	public ResponseEntity<List<FacturaDet>> listar() {
		return ResponseEntity.ok(facS.ListarRegistro());	
	}
	/*
	@PostMapping(path="/add")
	public String insert(@RequestBody FacturaDet c) {
		String msg = "Error al guardar el registro..";
		int b = facS.GuardarRegistro(c);
		if(b==1) msg="Registro guardado satisfactoriamente";
		return msg;
	}

	@DeleteMapping(path="/delete/{id}")
	public int EliminarRegistro(@PathVariable int id) {
		// TODO Auto-generated method stub
		return facS.EliminarRegistro(id);
	}
*/
}
