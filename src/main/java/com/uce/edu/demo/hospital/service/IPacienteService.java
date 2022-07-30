package com.uce.edu.demo.hospital.service;

import com.uce.edu.demo.hospital.modelo.Paciente;

public interface IPacienteService {
	public void insertar (Paciente paciente);
	public Paciente buscar (Integer id);
	public void actualizar (Paciente paciente);
	public void eliminar (Integer id);
	public Paciente buscarPorCedula ( String cedula);
}
