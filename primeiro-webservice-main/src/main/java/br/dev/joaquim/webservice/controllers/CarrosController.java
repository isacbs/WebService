package br.dev.joaquim.webservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.dev.joaquim.webservice.entities.Carro;
import br.dev.joaquim.webservice.services.CarrosManager;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class CarrosController {
    private CarrosManager manager = new CarrosManager();

    //CREATE
    @PostMapping("/carros")
    public Carro create(@RequestBody Carro carro) {
        return manager.add(carro);
    }
    
    @GetMapping("/api/carros")
    public List<Carro> getCarros() {
        return manager.getCarros();
    }

    @DeleteMapping("/carros/{codigo}")
    public void deleteCarro(@PathVariable int codigo) {
        manager.remove(codigo);
    }
}
