package br.com.veiculos.controller;

import br.com.veiculos.model.Motor;

public class MotorController {
    private Motor motor;

    public MotorController(Motor motor) {
        this.motor = motor;
    }

    public void verificarPecaFabricada(){
        if (!motor.pecaFabricada()){
            System.out.println("Peça Fabricada com sucesso");
        } else{
            System.out.println("Fabricar Peça");
        }
    }
}
