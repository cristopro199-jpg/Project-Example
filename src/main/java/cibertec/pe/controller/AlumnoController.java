package cibertec.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cibertec.pe.model.Alumno;
import cibertec.pe.service.IAlumnoService;

@Controller
public class AlumnoController {
	
	@Autowired
	private IAlumnoService alumnoService;
	
	@GetMapping("/")
    public String inicio() {
		return "Index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/listAll")
	public String ListarAlumno(Model modelo) {
		modelo.addAttribute("alumnoss", alumnoService.listarAlumnos());
		return "alumnos";
	}
	
	@GetMapping("/nuevo")
	public String visualizarFormularioNuevoAlumno(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		return "formularioAlumno";
	}
	
	@PostMapping("/saveAlumno")
	public String guardarAlumno(Alumno alumno) {
		alumnoService.guardarAlumno(alumno);
		return "redirect:/listAll";
	}
	
	@GetMapping("/editarAlumno/{codigo}")
	public String editarAlumno(@PathVariable int codigo, Model modelo) {
		modelo.addAttribute("alumno", alumnoService.buscarAlumno(codigo));
		return "formularioAlumno";
	}
	
	@GetMapping("/eliminarAlumno/{codigo}")
	public String eliminarAlumno(@PathVariable int codigo) {
		alumnoService.eliminarAlumno(codigo);
		return "redirect:/listAll";
	}
	
}
