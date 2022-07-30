package com.uce.edu.demo.hospital.service;

import com.uce.edu.demo.hospital.modelo.Doctor;

public interface IDoctorService {
	public void insertar (Doctor doctor);
	public Doctor buscar (Integer id);
	public void actualizar (Doctor doctor);
	public void eliminar (Integer id);
	public Doctor buscarPorCedula (String cedula);
}
