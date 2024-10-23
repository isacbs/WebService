package br.dev.joaquim.webservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.joaquim.webservice.entities.Curso;
import br.dev.joaquim.webservice.services.CursosManager;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class CursosController {
    private final CursosManager manager = new CursosManager();

    //CREATE
    @PostMapping("/cursos")
    public Curso create(@RequestBody Curso curso) {
        return manager.add(curso);
    }
    
    @GetMapping("/cursos")
    public List<Curso> getCursos() {
        return manager.getCursos();
    }
    
    @DeleteMapping("/cursos/{codigo}")
    public void deleteCurso(@PathVariable int codigo) {
        manager.remove(codigo);
    }
}
