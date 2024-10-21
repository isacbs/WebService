package br.dev.atividade.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/*
 * 
 * 
 * @author Isadora Caetano Brandão de Sousa
 * @tia 10420646
 *
 *  
 * **/ 

@RestController
@RequestMapping("/cars")

public class CarrosController {
    private List<Carro> carros = new ArrayList<>();

    public CarrosController() {
        carros.add(new Carro("Ferrari Purosangue","Ferrari"));
        carros.add(new Carro("Zenith","Aston Martin"));
    }

    @GetMapping
    public List<Carro> listCarros() {
        return carros;
    }
    
}
