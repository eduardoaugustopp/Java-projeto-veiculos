package br.com.veiculos.test;

import br.com.veiculos.model.Carro;
import br.com.veiculos.model.Motor;
import br.com.veiculos.model.Roda;
import br.com.veiculos.view.CarroView;

public class CarroTest {
    public static void main(String[] args) {

        Motor motor1 = new Motor("Elétrico", 762);

        Roda roda1 = new Roda("Alumínio", 19, 4);

        Carro carro1 = new Carro(motor1, roda1, "1HGCM82633A678942", 02, true);

        CarroView carroView = new CarroView();

        // CarroController carroController = new CarroController(carroView);

        // carroController.fabricarCarro();

        carro1.fabricar();

        carro1.instalar();
        
        carroView.fabricacaoConcluida(carro1);

    }
}
