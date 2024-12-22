package br.com.veiculos.model;

public class Motor {
    private String tipo;
    private double potencia;
    private boolean peca;

    public void peca() {
        this.peca = true;
    }

    public boolean pecaFabricada() {
        return peca;
    }

    public void obterTipo() {
        System.out.println(toString());
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Motor(String tipo, double potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Potência: " + getPotencia() + " CV, Tipo: " + getTipo();
    }

}
