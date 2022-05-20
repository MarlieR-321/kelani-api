package uca.edu.ni.kelani.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uca.edu.ni.kelani.modelos.Producto;
import uca.edu.ni.kelani.repositories.ProductoRepository;

@Service
public class ProductoServices{

	@Autowired(required = true)
	ProductoRepository prp;
	

	public List<Producto> ListarRegistro() {
		// TODO Auto-generated method stub
		return prp.findAll();
	}
	
	public Producto GuardarRegistro(Producto p) {
		return prp.save(p);
	}
	
	public Producto EditarRegistro(Producto p) {
		return prp.save(p);
	}
	
	public void EliminarRegistro(int id) {
		prp.deleteById(id);
	}

}
