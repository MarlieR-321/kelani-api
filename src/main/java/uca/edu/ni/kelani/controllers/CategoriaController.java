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

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import uca.edu.ni.kelani.modelos.Categoria;
import uca.edu.ni.kelani.services.CategoriaServices;


@RestController
@RequestMapping(path="/categoria")

public class CategoriaController {
	

	@Autowired
	CategoriaServices cat;

	@GetMapping("/listar")
    public List<Categoria> listar() {
        return cat.ListarRegistro();
    }


	@PostMapping(path="/add")
	public Categoria insert(@RequestBody Categoria c) {
		return cat.GuardarRegistro(c);
	}

	@DeleteMapping(path="/delete/{id}")
	public void EliminarRegistro(@PathVariable int id)  {
		cat.EliminarRegistro(id);
		
	}

}

