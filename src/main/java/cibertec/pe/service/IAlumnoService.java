package cibertec.pe.service;

import java.util.List;
import java.util.Optional;

import cibertec.pe.model.Alumno;

public interface IAlumnoService {
   public List<Alumno>     listarAlumnos();
   public Alumno           guardarAlumno(Alumno alumno);
   public Optional<Alumno> buscarAlumno(int codigo);
   public void             eliminarAlumno(int codigo);
}
