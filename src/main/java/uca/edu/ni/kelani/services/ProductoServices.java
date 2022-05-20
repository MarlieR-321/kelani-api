package uca.edu.ni.kelani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uca.edu.ni.kelani.modelos.Producto;
import uca.edu.ni.kelani.repositories.ProductoRepository;

@Service
public class ProductoServices{

	@Autowired(required = true)
	ProductoRepository prp;

	public Producto GuardarRegistro(Producto p) {
		return prp.save(p);
	}
	
	public void EliminarRegistro(int id) {
		prp.deleteById(id);
	}

}
