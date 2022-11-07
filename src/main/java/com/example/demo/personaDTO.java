package com.example.demo;

public class personaDTO {
	private String nombre;
	private String apellido;
	private String mensaje;
	private String[] aptitudes;
	
	// Crear getters y setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje (String mensaje) {
		this.mensaje = mensaje;
	}

	public String[] getAptitudes() {
		return aptitudes;
	}
	
	public void setAptitudes(String[] aptitudes) {
		this.aptitudes = aptitudes;
	}
}
