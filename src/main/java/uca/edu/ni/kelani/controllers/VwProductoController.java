package uca.edu.ni.kelani.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uca.edu.ni.kelani.modelos.Vw_Producto;
import uca.edu.ni.kelani.services.Vw_ProductoServices;

@RestController
@RequestMapping(path = "/producto")
public class VwProductoController {
	
	@Autowired(required = true)
	Vw_ProductoServices proS;
	
	@GetMapping(path = "/listar")
	public List<Vw_Producto> listarVw(){
		return proS.ListarRegistro();
	}

}
