package br.com.veiculos.model;

public class Roda {
    private String material;
    private double tamanho;
    protected int numeroRodas;

    public Roda(String material, double tamanho, int numeroRodas) {
        this.material = material;
        this.tamanho = tamanho;
        this.numeroRodas = numeroRodas;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

}
