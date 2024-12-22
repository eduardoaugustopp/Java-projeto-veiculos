package br.com.veiculos.view;

import br.com.veiculos.model.Motor;

public class MotorView {
    public void fabricacaoConcluida(Motor motor){
        System.out.println("-----------------------------------------------------");
        System.out.println(motor.getPotencia());
        System.out.println(motor.getTipo());
    }
}
