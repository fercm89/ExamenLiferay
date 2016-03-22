package com.ejemplo;

public class Usuario {

	private String nombre;
	private String id;
	private String apellido;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Usuario(String nombre, String id, String apellido) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.apellido = apellido;
	}
	
}
	
	