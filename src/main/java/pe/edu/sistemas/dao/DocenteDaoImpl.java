package pe.edu.sistemas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.edu.sistemas.entities.Docente;


@Repository
public class DocenteDaoImpl implements DocenteDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	
	@Override
	public List<Docente> listarDocente() {
		return entityManager.createQuery("from Semestre s join fetch s.docente d ").getResultList();
	}
}
