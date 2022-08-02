package com.uce.edu.demo.hospital.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.hospital.modelo.Paciente;
import com.uce.edu.demo.hospital.modelo.PacienteTo;

public interface IPacienteRepository {

	public void insertar (Paciente paciente);
	public Paciente buscar (Integer id);
	public void actualizar (Paciente paciente);
	public void eliminar (Integer id);
	public Paciente buscarPorCedula ( String cedula);
	
	public List<PacienteTo>  buscarPaciente  (LocalDateTime fechaNacimiento, String genero);
	}
