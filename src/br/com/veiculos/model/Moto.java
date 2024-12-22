package br.com.veiculos.model;

import br.com.veiculos.servic.Componente;

public class Moto extends Veiculo implements Componente {
    private boolean cambioAutomatico;
    private boolean possuiBau;

    public Moto(Motor motor, Roda rodas, String chassi, boolean cambioAutomatico, boolean possuiBau) {
        super(motor, rodas, chassi);
        this.cambioAutomatico = cambioAutomatico;
        this.possuiBau = possuiBau;
    }

    {
        System.out.println("Bloco de inicializacao toda vez que cria uma moto");
        System.out.println();
    }

    @Override
    public void fabricar() {
        System.out.println("Método fabricar de Veículos - Moto Fabricada");
    }

    @Override
    public void instalar() {
        System.out.println("Método da interface Componente na Moto " + Veiculo.getAnoDeFabricacao());
    }

    public boolean getCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public boolean getPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }

}
