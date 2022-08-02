package com.uce.edu.demo.hospital.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.hospital.modelo.CitaMedica;
@Repository
@Transactional
public class CitaMedicaRepositoryImpl  implements ICitaMedicaRepository{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
		
	}

	@Override
	public  CitaMedica buscarPorNumeroCita(String numeroCita) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery("SELECT c FROM CitaMedica c WHERE c.numeroCita =:datoNumeroCita");
		myQuery.setParameter("datoNumeroCita", numeroCita);
		return (CitaMedica) myQuery.getSingleResult();
	}

	
}
