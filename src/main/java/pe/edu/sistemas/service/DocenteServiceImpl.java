package pe.edu.sistemas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sistemas.dao.DocenteDao;
import pe.edu.sistemas.entities.Docente;


@Service
public class DocenteServiceImpl implements DocenteService {
	
	@Autowired
	private DocenteDao docenteDao;

	@Override
	@Transactional
	public List<Docente> listarDocente() {
		// TODO Auto-generated method stub
		return docenteDao.listarDocente();
	}
	
	
}
