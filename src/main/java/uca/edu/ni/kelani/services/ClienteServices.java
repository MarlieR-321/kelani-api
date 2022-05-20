package uca.edu.ni.kelani.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uca.edu.ni.kelani.modelos.Cliente;
import uca.edu.ni.kelani.repositories.ClienteRepository;


@Service
public class ClienteServices {
	
	@Autowired(required=true)
	ClienteRepository cli;


	public List<Cliente> ListarRegistro() {
		// TODO Auto-generated method stub
		return cli.findAll();
	}

	public Cliente GuardarRegistro(Cliente cl) {
		// TODO Auto-generated method stub
		return cli.save(cl);
	}


	public Cliente EditarRegistro(Cliente cl) {
		// TODO Auto-generated method stub
		return cli.save(cl);
	}


	public void EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		cli.deleteById(id);
	}
	
	public Cliente ClienteById(int id) {
		// TODO Auto-generated method stub
		return	cli.getById(id);
	}
}
