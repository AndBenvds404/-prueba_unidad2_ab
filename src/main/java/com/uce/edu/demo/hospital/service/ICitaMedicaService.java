package com.uce.edu.demo.hospital.service;

import com.uce.edu.demo.hospital.modelo.CitaMedica;

public interface ICitaMedicaService {
	
	public void insertar (CitaMedica citaMedica);
	public CitaMedica buscar (Integer id);
	public void actualizar (CitaMedica citaMedica);
	public void eliminar (Integer id);
	public CitaMedica buscarPorNumeroCita ( String numero);

}
