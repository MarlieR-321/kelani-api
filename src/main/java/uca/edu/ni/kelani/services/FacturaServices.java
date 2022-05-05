package uca.edu.ni.kelani.services;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uca.edu.ni.kelani.modelos.Factura;
import uca.edu.ni.kelani.repositories.FacturaDRepository;
import uca.edu.ni.kelani.repositories.FacturaIRepository;

@Service
public class FacturaServices implements FacturaIRepository{

	@Autowired
	FacturaDRepository frp;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return frp.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Factura c) {
		// TODO Auto-generated method stub
		return frp.GuardarRegistro(c);
	}

	@Override
	public int EditarRegistro(Factura c) {
		// TODO Auto-generated method stub
		return frp.EditarRegistro(c);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return frp.EliminarRegistro(id);
	}

}
