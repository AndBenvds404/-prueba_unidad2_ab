package com.uce.edu.demo.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.hospital.modelo.CitaMedica;
import com.uce.edu.demo.hospital.repository.ICitaMedicaRepository;
@Service
public class CitaMedicaServiceImpl  implements ICitaMedicaService {

	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.iCitaMedicaRepository.insertar(citaMedica);
	}

	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCitaMedicaRepository.buscar(id);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.iCitaMedicaRepository.actualizar(citaMedica);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CitaMedica buscarPorNumeroCita(String numero) {
		// TODO Auto-generated method stub
		return this.iCitaMedicaRepository.buscarPorNumeroCita(numero);
	}

	
}
