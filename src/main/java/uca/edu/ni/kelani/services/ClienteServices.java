package uca.edu.ni.kelani.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uca.edu.ni.kelani.modelos.Cliente;

import uca.edu.ni.kelani.repositories.ClienteDRepository;
import uca.edu.ni.kelani.repositories.ClienteIRepository;

@Service
public class ClienteServices implements ClienteIRepository {
	@Autowired
	ClienteDRepository cli;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return cli.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Cliente cl) {
		// TODO Auto-generated method stub
		return cli.GuardarRegistro(cl);
	}

	@Override
	public int EditarRegistro(Cliente cl) {
		// TODO Auto-generated method stub
		return cli.EditarRegistro(cl);
	}

	@Override
	public int EliminarRegistro(Cliente cl) {
		// TODO Auto-generated method stub
		return cli.EliminarRegistro(cl);
	}
}
