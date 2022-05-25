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

import uca.edu.ni.kelani.modelos.Cliente;
import uca.edu.ni.kelani.services.ClienteServices;

@RestController
@RequestMapping(path="/cliente")
public class ClienteController {
	
	@Autowired
	ClienteServices cliS;
	
	@GetMapping(path="/listar")
	public List<Cliente> listar() {
		return cliS.ListarRegistro();
	}
	
	@PostMapping(path="/add")
	public Cliente insert(@RequestBody Cliente cl) {
		return cliS.GuardarRegistro(cl);
	}

	@PutMapping(path="/edit")
	public Cliente edit(@RequestBody Cliente cl) {
		return cliS.EditarRegistro(cl);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public void EliminarRegistro(@PathVariable int id) {
		cliS.EliminarRegistro(id);
	}
	
	@GetMapping(path="/clienteById/{id}")
	public Cliente listarById( @PathVariable int id) {
		return cliS.ClienteById(id);
	}
}
