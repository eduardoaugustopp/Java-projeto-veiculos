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
        System.out.println("\nBloco de inicializacao toda vez que cria uma moto\n");
    }

    @Override
    public void fabricar() {
        System.out.println("Método fabricar da superclasse (Veículos) - Moto\n");
    }

    @Override
    public void instalar() {
        System.out.println("Método instalar da interface Componente - Moto ");
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

    @Override
    public String toString() {
        return "Câmbio Automático: " + (getCambioAutomatico() ? "Sim" : "Não") +
                ", Possui Baú: " + (getPossuiBau() ? "Sim" : "Não");
    }

}
