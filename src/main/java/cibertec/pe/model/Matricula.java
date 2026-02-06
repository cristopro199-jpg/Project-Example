package cibertec.pe.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_Matricula")
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_Matricula")
	private int codigo;
	@Column(name = "periodo_Matricula")
	private String periodo;
	
	@OneToOne
	@JoinColumn(
			name = "codigo_Alumno",
			referencedColumnName = "codigo_Alumno"
			)
	private Alumno alumno;
	
	@OneToMany(
			mappedBy = "matricula",
			cascade = CascadeType.ALL
			)
	private List<Curso> cursolist;

	public Matricula() { }

	public Matricula(int codigo, String periodo, Alumno alumno) {
		this.codigo = codigo;
		this.periodo = periodo;
		this.alumno = alumno;
	}

	public Matricula(String periodo, Alumno alumno) {
		this.periodo = periodo;
		this.alumno = alumno;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	
}
