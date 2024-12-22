package br.com.veiculos.model;

import br.com.veiculos.servic.Componente;

public class Carro extends Veiculo implements Componente {

    private int numeroDePortas;
    private boolean possuiAirbag;

    public Carro(Motor motor, Roda rodas, String chassi, int numeroDePortas, boolean possuiAirbag) {
        super(motor, rodas, chassi);
        this.numeroDePortas = numeroDePortas;
        this.possuiAirbag = possuiAirbag;
    }
    {
        System.out.println("Bloco de inicialização toda vez que cria um carro");
        System.out.println();
    }

    @Override
    public void fabricar() {
        System.out.println("Carro Fabricado: Método fabricar da superclasse");
    }

    @Override
    public void instalar() {
        System.out.println("Método instalar da interface Componente - Carro");
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public boolean getPossuiAirbag() {
        return possuiAirbag;
    }

    public void setPossuiAirbag(boolean possuiAirbag) {
        this.possuiAirbag = possuiAirbag;
    }

    @Override
    public String toString() {
        return "Carro [numeroDePortas=" + numeroDePortas + ", possuiAirbag=" + possuiAirbag + ", getMotor()="
                + getMotor() + ", getRodas()=" + getRodas() + ", getChassi()=" + getChassi() + "]";
    }

  
}
