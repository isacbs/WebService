package br.dev.joaquim.webservice.services;

import java.util.*;

import br.dev.joaquim.webservice.entities.Carro;

public class CarrosManager {
    private List<Carro> carros;
    private int placaCount;

    public CarrosManager() {
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("Nivus", "VW", 1234));
        this.carros.add(new Carro("Tucson", "Hynday", 6534));
        this.carros.add(new Carro("Nivus", "VW", 8765));
        this.carros.add(new Carro("Tucson", "Hynday",8764));
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public List<Carro> getCursos() {
        return this.carros;
    }

    public Carro add(Carro carro) {
        carro.setPlaca(++placaCount);
        this.carros.add(carro);
        return carro;
    }

    public Carro getByPlaca(int placa) {
        for(Carro c: this.carros) {
            if(c.getPlaca() == placa) return c;
        }
        return null;
    }

    public void remove(int placa) {
        Carro aRemover = getByPlaca(placa);
        if(aRemover == null) return;
        this.carros.remove(aRemover);
    }

    // public void update(int placa, Carro car) {
    //     remove(placa);
    //     curso.setPlaca();
    //     this.carros.add(car);
    // }

    public void update(int placa, Carro car) {
        Carro antigo = getByPlaca(placa);
        antigo.setMarca(car.getMarca());
        antigo.setModelo(car.getModelo());
    }
}
