package br.com.veiculos.test;

import br.com.veiculos.controller.CarroController;
import br.com.veiculos.model.Carro;
import br.com.veiculos.model.Motor;
import br.com.veiculos.model.Roda;
import br.com.veiculos.view.CarroView;
import br.com.veiculos.view.MotorView;
import br.com.veiculos.view.RodaView;

public class CarroTest {
    public static void main(String[] args) {

        Motor motor1 = new Motor("Elétrico", 762);

        Roda roda1 = new Roda("Alumínio", 19, 4);

        Carro carro1 = new Carro(motor1, roda1, "1HGCM82633A678942", 02, true);

        Carro carro2 = new Carro(motor1, roda1, "1HGCM82633A678942", 04, true);

        CarroView carroView = new CarroView();

        carroView.fabricacaoConcluida(carro1);

        MotorView motorView = new MotorView();
        RodaView rodaView = new RodaView();

        rodaView.fabricacaoConcluida(roda1);

        CarroController carroController = new CarroController(carroView);

        carroController.fabricarCarro();

        carro1.fabricar();

        carroView.fabricacaoConcluida(carro1);
        carroView.fabricacaoConcluida(carro2);
        motorView.fabricacaoConcluida(motor1);

        System.out.println();
        carro2.fabricar();
        System.out.println();
        carro1.instalar();
        System.out.println();

    }
}
