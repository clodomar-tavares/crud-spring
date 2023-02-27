package com.edutav.crudspring.controller;

import java.util.List;

import com.edutav.crudspring.models.Curso;
import com.edutav.crudspring.repositories.CursoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/cursos")
@AllArgsConstructor
public class CursosController {

    private final CursoRepository cursoRepository;

    @GetMapping
    public @ResponseBody List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

}
