package br.com.veiculos.view;

import br.com.veiculos.model.Roda;

public class RodaView {
    
    public void fabricacaoConcluida(Roda roda){
        System.out.println("Teste view Roda");
        System.out.println(roda.getMaterial());
        System.out.println(roda.getNumeroRodas());
        System.out.println(roda.getTamanho());
        
       
    }
}
