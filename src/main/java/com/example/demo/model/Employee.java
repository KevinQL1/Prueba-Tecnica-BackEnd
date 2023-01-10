package com.example.demo.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Employee")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String  name;
	private String entry_date;
	private float salary_dollar;

	public Employee() {
	}
	
	
	public Employee(String name, String entry_date, float salary_dollar, Solicitude solicitude) {
		super();
		this.name = name;
		this.entry_date = entry_date;
		this.salary_dollar = salary_dollar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
			this.name = name;
	}

	public String getEntry_date() {
		DateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
		String date = dateFormat.format(new Date());
		this.entry_date = date;
		return entry_date;
	}

	public void setEntry_date(String entry_date) {
		DateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
		String date = dateFormat.format(new Date());
		this.entry_date = date;
	}

	public float getSalary() {
		return salary_dollar*1000;
	}

	public void setSalary(float salary_dollar) {
		this.salary_dollar = salary_dollar;
	}
}
