package com.org.generation.blogpessoal.model;

public class UserLogin {
	
	private long id;

	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String token;
	
	private String tipoUsuario;
	
	private String foto;



	
	
	//-------------------------------GETTERS/SETTERS--------------------------------------------

	
	public long getId() {
		return id;
	}


	public String getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	

}
