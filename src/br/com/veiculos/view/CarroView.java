package br.com.veiculos.view;

import br.com.veiculos.model.Carro;

public class CarroView {
    public void fabricacaoConcluida(Carro carro) {
        System.out.println("Carro fabricado com " + carro.getNumeroDePortas() + " portas" );
    }
}
