package com.uce.edu.demo.hospital.repository;

import com.uce.edu.demo.hospital.modelo.Doctor;

public interface IDoctorRepository {
	
	public void insertar (Doctor doctor);
	public Doctor buscar (Integer id);
	public void actualizar (Doctor doctor);
	public void eliminar (Integer id);
	public Doctor buscarPorCedula (String cedula);
}
