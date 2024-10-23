package br.dev.joaquim.webservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Carro {
    private String modelo;
    private String marca;
    private int placa;
}