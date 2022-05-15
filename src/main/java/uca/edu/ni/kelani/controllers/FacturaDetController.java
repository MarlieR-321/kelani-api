package uca.edu.ni.kelani.controllers;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uca.edu.ni.kelani.modelos.FacturaDet;
import uca.edu.ni.kelani.services.FacturaDetServices;


@RestController
@RequestMapping(path="/fdetalle")
public class FacturaDetController {

	@Autowired
	FacturaDetServices facS;
	
	@RequestMapping(path="/list/{id}")
	public List<Map<String, Object>> listar(@PathVariable int id) {
		// TODO Auto-generated method stub
		return facS.ListarRegistro(id);
	}
	
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

}
