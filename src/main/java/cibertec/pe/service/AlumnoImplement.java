package cibertec.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.pe.model.Alumno;
import cibertec.pe.repository.IAlumnoRepository;

@Service
public class AlumnoImplement implements IAlumnoService {

	@Autowired
	private IAlumnoRepository alumnoRep;
	
	@Autowired
	private IAlumnoRepository alumnoRepo;
	
	@Override
	public List<Alumno> listarAlumnos() {
		return alumnoRep.findAll();
	}
	
	@Override
	public Alumno guardarAlumno(Alumno alumno) {
		return alumnoRepo.save(alumno);
	}

	@Override
	public Optional<Alumno> buscarAlumno(int codigo) {
		return alumnoRepo.findById(codigo);
	}

	@Override
	public void eliminarAlumno(int codigo) {
		alumnoRepo.deleteById(codigo);
	}

	

}
