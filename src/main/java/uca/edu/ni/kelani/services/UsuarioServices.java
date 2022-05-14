package uca.edu.ni.kelani.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uca.edu.ni.kelani.modelos.Usuario;
import uca.edu.ni.kelani.repositories.UsuarioDRepository;
import uca.edu.ni.kelani.repositories.UsuarioIRepository;

@Service
public class UsuarioServices implements UsuarioIRepository {
	@Autowired
	UsuarioDRepository use;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return use.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Usuario us) {
		// TODO Auto-generated method stub
		return use.GuardarRegistro(us);
	}

	@Override
	public int EditarRegistro(Usuario us) {
		// TODO Auto-generated method stub
		return use.EditarRegistro(us);
	}

	@Override
	public int EliminarRegistro(Usuario us) {
		// TODO Auto-generated method stub
		return use.EliminarRegistro(us);
	}
}
