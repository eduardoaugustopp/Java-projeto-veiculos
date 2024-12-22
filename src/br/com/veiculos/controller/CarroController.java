package br.com.veiculos.controller;

import br.com.veiculos.view.CarroView;

public class CarroController {
    private CarroView carroView;

    public CarroController(CarroView carroView){
        this.carroView = carroView;
    }

    public void fabricarCarro(){
        System.out.println(carroView + " testandoo");
        
        
    }
    
}
