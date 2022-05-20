package uca.edu.ni.kelani.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import uca.edu.ni.kelani.modelos.Categoria;

import uca.edu.ni.kelani.repositories.CategoriaRepository;
import uca.edu.ni.kelani.repositories.VwFacturaRepository;



@Service
public class CategoriaServices {
	
	@Autowired(required=true)
	CategoriaRepository ct;

	
	public List<Categoria> ListarRegistro() {
		return ct.findAll();
	}

	public Categoria GuardarRegistro(Categoria c) {
		return ct.save(c);
	}


	public void EliminarRegistro(int id) {
		ct.deleteById(id);
	}

}
