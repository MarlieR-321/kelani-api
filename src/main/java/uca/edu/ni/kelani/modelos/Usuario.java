package uca.edu.ni.kelani.modelos;

public class Usuario {

	private int id_usuario;
	private String username;
	private String pwd;
	private String nombre_real;
	private String email;
	private int estado;
	
	
	public Usuario(int id_usuario, String username, String pwd, String nombre_real,  String email,int estado) {
		this.id_usuario = id_usuario;
		this.username = username;
		this.pwd = pwd;
		this.nombre_real = nombre_real;
		this.email = email;
		this.estado = estado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNombre_real() {
		return nombre_real;
	}

	public void setNombre_real(String nombre_real) {
		this.nombre_real = nombre_real;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	
	

	
}
