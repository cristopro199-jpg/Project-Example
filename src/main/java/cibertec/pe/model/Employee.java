package cibertec.pe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_Employee")
	private int codigo;
	
	@Column(name = "nombre_Employee")
	private String nombre;
	
	@Column(name = "email_Employee")
	private String email;
	
	@Column(name = "phone_Employee")
	private String phone;
	
	@Column(name = "salary_Employee")
	private double salary;

}
