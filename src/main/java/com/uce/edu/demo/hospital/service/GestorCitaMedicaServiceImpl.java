package com.uce.edu.demo.hospital.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.hospital.modelo.CitaMedica;
@Service
public class GestorCitaMedicaServiceImpl implements IGestorCitaMedicaService{
	
	@Autowired
	private IPacienteService iPacienteService;
	@Autowired
	private IDoctorService iDoctorService;
	@Autowired
	private ICitaMedicaService iCitaMedicaService;
	

	@Override
	public void AgendamientoCitaMedica(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita,
			String lugarCita, String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
			
			CitaMedica cm = new CitaMedica();
			cm.setNumeroCita(numeroCita);
			cm.setFechaCita(fechaCita);
			cm.setValorCita(valorCita);
			cm.setLugarCita(lugarCita);
			cm.setDoctor(this.iDoctorService.buscarPorCedula(cedulaPaciente));
			cm.setPaciente(this.iPacienteService.buscarPorCedula(cedulaPaciente));
			
			this.iCitaMedicaService.insertar(cm);
		
	}

	@Override
	public void citaMedicaFinal(String numeroCita, String diagnostico, String receta, LocalDateTime fechaProximaCita) {
		// TODO Auto-generated method stub
		CitaMedica cm = this.iCitaMedicaService.buscarPorNumeroCita(numeroCita);
		cm.setDiagnostico(diagnostico);
		cm.setReceta(receta);
		cm.setFechaProximaCita(fechaProximaCita);
		this.iCitaMedicaService.actualizar(cm);
	}

	@Override
	public void reportePaciente(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		
	}

	
}
