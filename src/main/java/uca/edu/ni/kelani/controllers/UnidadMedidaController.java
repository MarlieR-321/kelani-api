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

import uca.edu.ni.kelani.modelos.UnidadMedida;

import uca.edu.ni.kelani.services.UnidadMedidaServices;


@RestController
@RequestMapping(path="/unidadMedida")

public class UnidadMedidaController {
	@Autowired
	UnidadMedidaServices um;
	
	@RequestMapping(path="/listar")
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return um.ListarRegistro();
	}
	
	@PostMapping(path="/agregar")
	public String insert(@RequestBody UnidadMedida umd) {
		String msg = "Error al guardar el registro..";
		int b = um.GuardarRegistro(umd);
		if(b==1) msg="Registro guardado satisfactoriamente";
		return msg;
	}

	@PutMapping(path="/editar/{id}")
	public String edit(@RequestBody UnidadMedida umd,@PathVariable int id,Model model) {
		String msg = "Error al editar el registro..";
		int b = um.EditarRegistro(umd);
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



