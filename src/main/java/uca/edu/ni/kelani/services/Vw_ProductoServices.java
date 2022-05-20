package uca.edu.ni.kelani.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import uca.edu.ni.kelani.modelos.Vw_Producto;
import uca.edu.ni.kelani.repositories.VwProductoRepository;

public class Vw_ProductoServices {

	@Autowired(required = true)
	VwProductoRepository vprp;
	
	public List<Vw_Producto> ListarRegistro(){
		return vprp.findAll();
	}
	
}
