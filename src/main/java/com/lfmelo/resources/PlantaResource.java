package com.lfmelo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lfmelo.models.Planta;
import com.lfmelo.services.PlantaService;

@RestController
@RequestMapping("/plantas")
public class PlantaResource {

	@Autowired
	private PlantaService serivce;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Planta> create(@RequestBody Planta planta) {
		return ResponseEntity.ok().body(this.serivce.create(planta));
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Planta>> findAll() {
		return ResponseEntity.ok().body(this.serivce.findAll());
	}

	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Planta> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(this.serivce.findById(id));
	}
	
}
