package uca.edu.ni.kelani.controllers;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uca.edu.ni.kelani.modelos.Categoria;
import uca.edu.ni.kelani.modelos.UnidadMedida;

import uca.edu.ni.kelani.services.UnidadMedidaServices;


@RestController
@RequestMapping(path="/unidadMedida")

public class UnidadMedidaController {
	
	@Autowired
	UnidadMedidaServices um;

	@GetMapping("/listar")
    public List<UnidadMedida> listar() {
        return um.ListarRegistro();
    }


	@PostMapping(path="/add")
	public ResponseEntity<UnidadMedida> insert(@RequestBody UnidadMedida u) {
		return ResponseEntity.ok(um.GuardarRegistro(u));
	}

	@DeleteMapping(path="/delete/{id}")
	public void EliminarRegistro(@PathVariable int id)  {
		um.EliminarRegistro(id);
	}
		@GetMapping(path="/unidadMedidaById/{id}")
		public UnidadMedida listarById( @PathVariable int id) {
			return um.UnidadMedidaById(id);
		}
	}
