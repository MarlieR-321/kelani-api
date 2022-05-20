package uca.edu.ni.kelani.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uca.edu.ni.kelani.modelos.Usuario;
import uca.edu.ni.kelani.repositories.UsuarioRepository;

@Service
public class UsuarioServices {
	
	@Autowired(required=true)
	UsuarioRepository use;

	
	public List<Usuario> ListarRegistro() {
		// TODO Auto-generated method stub
		return use.findAll();
	}

	public Usuario GuardarRegistro(Usuario us) {
		// TODO Auto-generated method stub
		return use.save(us);
	}


	public Usuario EditarRegistro(Usuario us) {
		// TODO Auto-generated method stub
		return use.save(us);
	}


	public void EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		use.deleteById(id);
	}
	
	
}
