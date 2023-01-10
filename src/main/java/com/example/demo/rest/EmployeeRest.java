package com.example.demo.rest;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.model.Solicitude;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee/")
@CrossOrigin("*")
public class EmployeeRest {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("all")
	private ResponseEntity<List<Employee>> getAllEmployee(){
		return ResponseEntity.ok(employeeService.findAll());
	}
	
	@GetMapping("find{id}")
	private ResponseEntity<List<Employee>> getAllSolicitudeByEmpleado(@PathVariable("id") Long id){
		return ResponseEntity.ok(employeeService.findAllById(id));
	}
	
	@PostMapping("save")
	private ResponseEntity<Employee> SaveEmployee(@RequestBody Employee employee){
		try {
			Employee saveEmployee = employeeService.save(employee);
			return ResponseEntity.created(new URI("/employee/"+saveEmployee.getId())).body(saveEmployee);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();		}
		
	} 
}
