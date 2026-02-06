package cibertec.pe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_Curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_Curso")
	private int codigo;
	@Column(name = "nombre_Curso", nullable = false, length = 50)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(
			name = "cod_Matricula")
	private Matricula matricula;
	
	public Curso() {

	}
	
	public Curso(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public Curso(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
