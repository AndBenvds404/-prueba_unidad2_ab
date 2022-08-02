package com.uce.edu.demo.hospital.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.hospital.modelo.PacienteTo;

public interface IGestorCitaMedicaService {
	
	public void AgendamientoCitaMedica ( String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, 
				String lugarCita, String cedulaDoctor, String cedulaPaciente);
	
	public void actualizarCitaMedica (String numeroCita, String diagnostico, String receta, LocalDateTime fechaProximaCita);
	
	public List<PacienteTo> reportePaciente (LocalDateTime fecha, String genero);

}
