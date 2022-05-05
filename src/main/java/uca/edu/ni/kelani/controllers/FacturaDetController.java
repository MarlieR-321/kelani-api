package uca.edu.ni.kelani.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uca.edu.ni.kelani.modelos.Factura;
import uca.edu.ni.kelani.modelos.FacturaDet;
import uca.edu.ni.kelani.services.FacturaDetServices;
import uca.edu.ni.kelani.services.FacturaServices;


@RestController
@RequestMapping(path="/fdetalle")
public class FacturaDetController {

	@Autowired
	FacturaDetServices facS;
	
	@RequestMapping(path="/listar/{id}")
	public List<Map<String, Object>> listar(@PathVariable int id) {
		// TODO Auto-generated method stub
		return facS.ListarRegistro(id);
	}
	
	@PostMapping(path="/agregar")
	public String insert(@RequestBody FacturaDet c) {
		String msg = "Error al guardar el registro..";
		int b = facS.GuardarRegistro(c);
		if(b==1) msg="Registro guardado satisfactoriamente";
		return msg;
	}

	@PutMapping(path="/editar/{id}")
	public String edit(@RequestBody FacturaDet c,@PathVariable int id,Model model) {
		String msg = "Error al editar el registro..";
		int b = facS.EditarRegistro(c);
		if(b==1) msg="Registro modificado satisfactoriamente";
		return msg;
	}
/*
	@RequestMapping(path="/eliminar/{id}")
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return frp.EliminarRegistro(id);
	}
*/
}
