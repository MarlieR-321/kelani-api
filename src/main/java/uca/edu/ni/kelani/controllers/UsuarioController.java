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

import uca.edu.ni.kelani.modelos.Usuario;
import uca.edu.ni.kelani.services.UsuarioServices;

@RestController
@RequestMapping(path="/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioServices usuS;
	
	@RequestMapping(path="/listar")
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return usuS.ListarRegistro();
	}
	
	@PostMapping(path="/agregar")
	public String insert(@RequestBody Usuario us) {
		String msg = "Error al guardar el registro..";
		int b = usuS.GuardarRegistro(us);
		if(b==1) msg="Registro guardado satisfactoriamente";
		return msg;
	}

	@PutMapping(path="/editar/{id}")
	public String edit(@RequestBody Usuario us,@PathVariable int id,Model model) {
		String msg = "Error al editar el registro..";
		int b = usuS.EditarRegistro(us);
		if(b==1) msg="Registro modificado satisfactoriamente";
		return msg;
	}

	/*
	 * @RequestMapping(path="/eliminar/{id}") public String EliminarRegistro(int id)
	 * { // TODO Auto-generated method stub return frp.EliminarRegistro(id); }
	 */
	
	@PutMapping(path="/eliminar/{id}")
	public String delete(@RequestBody Usuario us,@PathVariable int id,Model model) {
		String msg = "Error al eliminar el registro..";
		int b = usuS.EliminarRegistro(us);
		if(b==1) msg="Registro eliminar satisfactoriamente";
		return msg;
	}

}
