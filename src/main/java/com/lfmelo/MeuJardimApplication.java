package com.lfmelo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lfmelo.models.Planta;
import com.lfmelo.repositories.PlantaRepository;

@SpringBootApplication
public class MeuJardimApplication implements ApplicationRunner {
	
	@Autowired
	private PlantaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MeuJardimApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Planta planta1 = new Planta(
				"Lágrimas-de-bebê",
				"Uma planta apreciada pelo valor ornamental de suas folhas, pode se espalhar rapidamente e cobrir a superfíce como um tapete.",
				Arrays.asList("s3://meu-jardim/lagrimas_de_bebe.jpg","s3://meu-jardim/lagrimas_de_bebe_1.jpg" ),
				"Sol parcial ou sombra total, manter o solo sempre úmido mas sem acumulo de água.");
		
		Planta planta2 = new Planta(
				"Colar-de-corações",
				"A colar-de-corações é uma trepadeira suculenta elegante e resistente.",
				Arrays.asList("s3://meu-jardim/colar_de_coracoes.jpg","s3://meu-jardim/colar_de_coracoes_2.jpg","s3://meu-jardim/colar_de_coracoes_3.jpg"),
				"Sol parcial, tolerante a seca, menos rega, regar quando sole estiver seco.");
		
		repository.saveAll(Arrays.asList(planta1, planta2));
	}

}
