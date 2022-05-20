package uca.edu.ni.kelani.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import uca.edu.ni.kelani.modelos.Categoria;
import uca.edu.ni.kelani.modelos.Cliente;
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


	public Categoria EditarRegistro(Categoria cta) {
		// TODO Auto-generated method stub
		return ct.save(cta);
	}


	public void EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		ct.deleteById(id);
	}
	
	public Categoria CategoriaById(int id) {
		// TODO Auto-generated method stub
		return	ct.getById(id);
	}
}
