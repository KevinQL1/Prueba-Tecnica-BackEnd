package com.example.demo.rest;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.SolicitudeService;
import com.example.demo.model.Employee;
import com.example.demo.model.Solicitude;

@RestController
@RequestMapping("/solicitude/")
@CrossOrigin("*")
public class SolicitudeRest {

	@Autowired
	private SolicitudeService solicitudeService;
	
	@GetMapping("find{id}")
	private ResponseEntity<List<Solicitude>> getAllSolicitudeByEmpleado(@PathVariable("id") Long id){
		return ResponseEntity.ok(solicitudeService.findAllById(id));
	}
	
	@GetMapping("all")
	private ResponseEntity<List<Solicitude>> getAllSolicitude(){
		return ResponseEntity.ok(solicitudeService.findAll());
	}
	
	@PostMapping("save")
	private ResponseEntity<Solicitude> SaveSolicitude(@RequestBody Solicitude solicitude){
		try {
			Solicitude saveSolicitude = solicitudeService.save(solicitude);
			return ResponseEntity.created(new URI("/solicitude/"+saveSolicitude.getId())).body(saveSolicitude);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();		}
		
	} 
}
