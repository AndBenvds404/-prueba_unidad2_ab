package com.uce.edu.demo.hospital.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.hospital.modelo.Paciente;

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
		TypedQuery<Paciente> myQuery = this.entityManager.createQuery("SELECT p FROM paciente p WHERE p.cedula =: datoCedula", Paciente.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}
	
	
	
	
}
