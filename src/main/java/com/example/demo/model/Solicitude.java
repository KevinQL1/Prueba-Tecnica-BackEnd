package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Solicitude")

public class Solicitude {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private	int id;
	private	String code;
	private	String description;
	private	String resumen;
	
	@ManyToOne
	@JoinColumn(name = "id_employee")
	private Employee employee;
	
	public Solicitude() {
	}
	
	public Solicitude(String code, String description, String resumen, Employee employee) {
		super();
		this.code = code;
		this.description = description;
		this.resumen = resumen;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
