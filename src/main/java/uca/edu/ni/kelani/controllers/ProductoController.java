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

import uca.edu.ni.kelani.modelos.Producto;
import uca.edu.ni.kelani.services.ProductoServices;

@RestController
@RequestMapping(path="/producto")
public class ProductoController {
	
	@Autowired
	ProductoServices proS;

	@RequestMapping(path="/listar")
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return proS.ListarRegistro();
	}
	
	@PostMapping(path="/agregar")
	public String insert(@RequestBody Producto p) {
		String msg = "Error al guardar el registro..";
		int b = proS.GuardarRegistro(p);
		if(b==1) msg="Registro guardado satisfactoriamente";
		return msg;
	}

	@PutMapping(path="/editar/{id}")
	public String edit(@RequestBody Producto p,@PathVariable int id,Model model) {
		String msg = "Error al editar el registro..";
		int b = proS.EditarRegistro(p);
		if(b==1) msg="Registro modificado satisfactoriamente";
		return msg;
	}
	
	@PutMapping(path="/eliminar/{id}")
	public String delete(@RequestBody Producto p,@PathVariable int id,Model model) {
		String msg = "Error al eliminar el registro..";
		int b = proS.EliminarRegistro(id);
		if(b==1) msg="Registro eliminar satisfactoriamente";
		return msg;
	}

	
}
