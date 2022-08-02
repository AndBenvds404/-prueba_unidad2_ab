package com.uce.edu.demo.hospital.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.hospital.modelo.Paciente;
import com.uce.edu.demo.hospital.modelo.PacienteTo;
import com.uce.edu.demo.hospital.repository.IPacienteRepository;
@Service
public class PacienteServiceImpl  implements IPacienteService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.insertar(paciente);
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscar(id);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.actualizar(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.eliminar(id);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscarPorCedula(cedula);
	}

	@Override
	public List<PacienteTo> buscarPaciente(LocalDateTime fechaNacimiento, String genero) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscarPaciente(fechaNacimiento, genero);
	}

	
}
