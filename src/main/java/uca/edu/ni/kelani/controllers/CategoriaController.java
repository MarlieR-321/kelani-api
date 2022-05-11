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

import uca.edu.ni.kelani.modelos.Categoria;
import uca.edu.ni.kelani.services.CategoriaServices;


@RestController
@RequestMapping(path="/categoria")

public class CategoriaController {
	

	@Autowired(required=true)
	CategoriaServices cat;
	
	@RequestMapping(path="/listar")
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return cat.ListarRegistro();
	}
	
	@PostMapping(path="/agregar")
	public String insert(@RequestBody Categoria cate) {
		String msg = "Error al guardar el registro..";
		int b = cat.GuardarRegistro(cate);
		if(b==1) msg="Registro guardado satisfactoriamente";
		return msg;
	}

	@PutMapping(path="/editar/{id}")
	public String edit(@RequestBody Categoria cate,@PathVariable int id,Model model) {
		String msg = "Error al editar el registro..";
		int b = cat.EditarRegistro(cate);
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



