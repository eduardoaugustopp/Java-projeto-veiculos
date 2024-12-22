package br.com.veiculos.test;

import br.com.veiculos.model.Moto;
import br.com.veiculos.model.Motor;
import br.com.veiculos.model.Roda;

import br.com.veiculos.view.MotoView;

public class MotoTest {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Elétrico", 762);

        Roda roda1 = new Roda("Alumínio", 19, 4);

        Moto moto1 = new Moto(motor1, roda1, "1HGCM82633A123456", false, false);

        MotoView motoView = new MotoView();

        moto1.fabricar();

        moto1.instalar();

        motoView.fabricacaoConcluida(moto1);

    }
}
