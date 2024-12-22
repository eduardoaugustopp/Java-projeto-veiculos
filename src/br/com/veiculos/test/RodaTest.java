package br.com.veiculos.test;

import br.com.veiculos.model.Roda;
import br.com.veiculos.view.RodaView;

public class RodaTest {
    public static void main(String[] args) {
        Roda roda1 = new Roda("Alumínio", 19, 4);
        
        RodaView rodaView = new RodaView();

        rodaView.fabricacaoConcluida(roda1);
    }
}
