package com.uce.edu.demo.hospital.modelo;

import java.time.LocalDateTime;

public class PacienteTo {
	
	private String cedula;
	private String nombre;
	private LocalDateTime fechaNacimiento;
	private String genero;
	
	public PacienteTo() {
		// TODO Auto-generated constructor stub
	}
	

	public PacienteTo(String cedula, String nombre, LocalDateTime fechaNaciemieto, String genero) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNaciemieto;
		this.genero = genero;
	}


	

	@Override
	public String toString() {
		return "PacienteTo [cedula=" + cedula + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", genero=" + genero + "]";
	}


	public String getCedula() {
		return cedula;
	}




	public void setCedula(String cedula) {
		this.cedula = cedula;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public LocalDateTime getFechaNaciemieto() {
		return fechaNacimiento;
	}




	public void setFechaNaciemieto(LocalDateTime fechaNaciemieto) {
		this.fechaNacimiento = fechaNaciemieto;
	}




	public String getGenero() {
		return genero;
	}




	public void setGenero(String genero) {
		this.genero = genero;
	}



	
	
	

}
