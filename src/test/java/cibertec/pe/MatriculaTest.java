package cibertec.pe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase.Replace;
import org.springframework.test.annotation.Rollback;

import cibertec.pe.model.Alumno;
import cibertec.pe.model.Matricula;
import cibertec.pe.repository.IAlumnoRepository;
import cibertec.pe.repository.IMatriculaRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class MatriculaTest {
    @Autowired
	private IMatriculaRepository matriculaRep;
    
    @Autowired
	private IAlumnoRepository alumnoRep;
    
    @Test
    @Rollback(false)
    public void saveMatricula() {
    	Alumno alumno = new Alumno("Markus", "Electroid", "Markus@gmail.com");
    	alumnoRep.save(alumno);
    	
    	Matricula matricula = new Matricula("2026-Enero", alumno);
    	matriculaRep.save(matricula);
    }
}
