package com.edutav.crudspring;

import com.edutav.crudspring.models.Curso;
import com.edutav.crudspring.repositories.CursoRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CursoRepository cursoRepository) {
		return args -> {
			cursoRepository.deleteAll();
			Curso curso = new Curso();
			curso.setNome("Angular");
			curso.setCategoria("Frontend");
			cursoRepository.save(curso);
		};
	}

}
