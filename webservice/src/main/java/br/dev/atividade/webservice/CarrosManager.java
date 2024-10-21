package br.dev.atividade.webservice;

/*
 * 
 * 
 * @author Isadora Caetano Brandão de Sousa
 * @tia 10420646
 *
 *  
 * **/ 

import java.util.*; 

public class CarrosManager {
    private List<Carro> carros;

    public CarrosManager() {
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("Lamborghini Aventador","Lamborghini"));
        this.carros.add(new Carro("McLaren Senna","McLaren"));
    }

    public List<Carro> getCarros() {
        return this.carros;
    }
}