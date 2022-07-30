package com.uce.edu.demo.hospital.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaMedicaService {
	
	public void AgendamientoCitaMedica ( String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, 
				String lugarCita, String cedulaDoctor, String cedulaPaciente);
	
	public void citaMedicaFinal (String numeroCita, String diagnostico, String receta, LocalDateTime fechaProximaCita);
	
	public void reportePaciente (LocalDateTime fecha, String genero);

}
