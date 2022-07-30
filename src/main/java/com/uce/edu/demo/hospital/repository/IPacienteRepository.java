package com.uce.edu.demo.hospital.repository;

import com.uce.edu.demo.hospital.modelo.Paciente;

public interface IPacienteRepository {

	public void insertar (Paciente paciente);
	public Paciente buscar (Integer id);
	public void actualizar (Paciente paciente);
	public void eliminar (Integer id);
	public Paciente buscarPorCedula ( String cedula);
}
