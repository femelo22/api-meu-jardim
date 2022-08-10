package com.lfmelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfmelo.models.Planta;
import com.lfmelo.repositories.PlantaRepository;

@Service
public class PlantaService {

	@Autowired
	private PlantaRepository repository;
	
	public List<Planta> findAll() {
		return this.repository.findAll();
	}
	
	public Planta findById(Long id) {
		return this.repository.findById(id).orElseThrow();
	}
	
	public Planta create(Planta planta) {
		return this.repository.save(planta);
	}
	
}
