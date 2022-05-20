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

import uca.edu.ni.kelani.modelos.Producto;
import uca.edu.ni.kelani.services.ProductoServices;

@RestController
@RequestMapping(path="/producto")
public class ProductoController {
	
	@Autowired
	ProductoServices proS;
	
	@GetMapping(path="/listar")
	public List<Producto> listar() {
		return proS.ListarRegistro();
	}
	
	@PostMapping(path = "/add")
	public Producto insert(@RequestBody Producto p) {
		return proS.GuardarRegistro(p);
	}
	
	@PutMapping(path="/edit/{id}")
	public Producto edit(@RequestBody Producto p) {
		return proS.EditarRegistro(p);
	}

	@DeleteMapping(path = "/delete/{id}")
	public void EliminarRegistro(@PathVariable int id) {
		proS.EliminarRegistro(id);
	}
	
}
