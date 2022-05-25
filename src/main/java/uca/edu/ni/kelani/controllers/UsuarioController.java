package uca.edu.ni.kelani.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping(path="/listar")
	public List<Usuario> listar() {
		return usuS.ListarRegistro();
	}
	
	@PostMapping(path="/add")
	public Usuario insert(@RequestBody Usuario us) {
		return usuS.GuardarRegistro(us);
	}

	@PutMapping(path="/edit")
	public Usuario edit(@RequestBody Usuario us) {
		return usuS.EditarRegistro(us);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public void EliminarRegistro(@PathVariable int id) {
		usuS.EliminarRegistro(id);
	}

}
