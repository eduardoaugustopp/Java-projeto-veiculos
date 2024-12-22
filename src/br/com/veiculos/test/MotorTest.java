package br.com.veiculos.test;

import br.com.veiculos.controller.MotorController;
import br.com.veiculos.model.Motor;
import br.com.veiculos.view.MotorView;

public class MotorTest {
    public static void main(String[] args) {
        
        Motor motor1 = new Motor("Elétrico", 762);

        MotorView motorView = new MotorView();

        MotorController motorController = new MotorController(motor1);

        motorView.fabricacaoConcluida(motor1);

        motorController.verificarPecaFabricada();

     

    }
}
