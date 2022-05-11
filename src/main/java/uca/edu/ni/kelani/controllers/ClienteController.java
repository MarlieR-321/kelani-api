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

import uca.edu.ni.kelani.modelos.Cliente;
import uca.edu.ni.kelani.services.ClienteServices;

@RestController
@RequestMapping(path="/cliente")
public class ClienteController {
	
	@Autowired
	ClienteServices cliS;
	
	@RequestMapping(path="/listar")
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return cliS.ListarRegistro();
	}
	
	@PostMapping(path="/agregar")
	public String insert(@RequestBody Cliente cl) {
		String msg = "Error al guardar el registro..";
		int b = cliS.GuardarRegistro(cl);
		if(b==1) msg="Registro guardado satisfactoriamente";
		return msg;
	}

	@PutMapping(path="/editar/{id}")
	public String edit(@RequestBody Cliente cl,@PathVariable int id,Model model) {
		String msg = "Error al editar el registro..";
		int b = cliS.EditarRegistro(cl);
		if(b==1) msg="Registro modificado satisfactoriamente";
		return msg;
	}

	/*
	 * @RequestMapping(path="/eliminar/{id}") public String EliminarRegistro(int id)
	 * { // TODO Auto-generated method stub return frp.EliminarRegistro(id); }
	 */
	
	@PutMapping(path="/eliminar/{id}")
	public String delete(@RequestBody Cliente cl,@PathVariable int id,Model model) {
		String msg = "Error al eliminar el registro..";
		int b = cliS.EliminarRegistro(cl);
		if(b==1) msg="Registro eliminar satisfactoriamente";
		return msg;
	}

}
