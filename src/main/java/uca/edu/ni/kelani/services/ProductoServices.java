package uca.edu.ni.kelani.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uca.edu.ni.kelani.modelos.Producto;
import uca.edu.ni.kelani.repositories.ProductoDRepository;
import uca.edu.ni.kelani.repositories.ProductoIRepository;

@Service
public class ProductoServices implements ProductoIRepository{

	@Autowired
	ProductoDRepository prp;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return prp.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Producto p) {
		// TODO Auto-generated method stub
		return prp.GuardarRegistro(p);
	}

	@Override
	public int EditarRegistro(Producto p) {
		// TODO Auto-generated method stub
		return prp.EditarRegistro(p);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return prp.EliminarRegistro(id);
	}

}
