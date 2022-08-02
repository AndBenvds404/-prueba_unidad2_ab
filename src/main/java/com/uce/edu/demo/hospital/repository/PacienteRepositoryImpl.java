package com.uce.edu.demo.hospital.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.hospital.modelo.Paciente;
import com.uce.edu.demo.hospital.modelo.PacienteTo;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}
	
	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Paciente> myQuery = this.entityManager.createQuery("SELECT p FROM Paciente p WHERE p.cedula =: datoCedula", Paciente.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<PacienteTo>  buscarPaciente(LocalDateTime fechaNacimiento, String genero) {
		// TODO Auto-generated method stub
		TypedQuery<PacienteTo> myQuery = this.entityManager.createQuery("SELECT NEW com.uce.edu.demo.hospital.modelo.PacienteTo(p.cedula, p.nombre,p.fechaNacimiento, p.genero) from Paciente p WHERE p.fechaNacimiento > :datoFechaNacimiento AND p.genero =:datoGenero",PacienteTo.class);
		myQuery.setParameter("datoFechaNacimiento", fechaNacimiento);
		myQuery.setParameter("datoGenero", genero);
		return myQuery.getResultList();
	}
	
	
	
	
}
