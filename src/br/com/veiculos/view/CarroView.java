package br.com.veiculos.view;

import br.com.veiculos.model.Carro;

public class CarroView {
    public void fabricacaoConcluida(Carro carro) {
        System.out.println("-------------------------------------------TESTEEEEEEEEEEEEEEE--------------------");
        System.out.println("Sobre o carro: ");
        System.out.println("Chassi: " + carro.getChassi());
        System.out.println("" + carro.getNumeroDePortas());
        System.out.println("" + carro.getMotor());
        System.out.println("" + carro.getPossuiAirbag());
        System.out.println(" " + carro.getRodas());
        System.out.println("" + Carro.getAnoDeFabricacao());
        System.out.println();
        System.out.println(carro.toString());
        
    }
}
