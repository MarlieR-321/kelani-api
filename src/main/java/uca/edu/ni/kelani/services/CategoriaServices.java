package uca.edu.ni.kelani.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import uca.edu.ni.kelani.modelos.Categoria;

import uca.edu.ni.kelani.repositories.CategoriaDRepository;
import uca.edu.ni.kelani.repositories.CategoriaIRepository;



@Service
public class CategoriaServices implements CategoriaIRepository {
	
	@Autowired(required=true)
	CategoriaDRepository ct;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return ct.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Categoria cat) {
		// TODO Auto-generated method stub
		return ct.GuardarRegistro(cat);
	}

	@Override
	public int EditarRegistro(Categoria cat) {
		// TODO Auto-generated method stub
		return ct.EditarRegistro(cat);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return ct.EliminarRegistro(id);
	}


}
