package com.uce.edu.demo.hospital.modelo;

import java.time.LocalDateTime;

public class PacienteTo {
	
	private LocalDateTime fecha;
	private String genero;
	
	public PacienteTo() {
		// TODO Auto-generated constructor stub
	}
	
	public PacienteTo(LocalDateTime fecha, String genero) {
		// TODO Auto-generated constructor stub
		this.fecha = fecha;
		this.genero= genero;
		
	}

	@Override
	public String toString() {
		return "PacienteTo [fecha=" + fecha + ", genero=" + genero + "]";
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	

}
