package br.com.veiculos.model;

public abstract class Veiculo {
    private Motor motor;
    private Roda rodas;
    private final String chassi;
    private static final int ANO_DE_FABRICACAO = 2024;
    

    static {
        System.out.println("Bloco de inicialização estático na superclasse (Veiculo), aparece apenas uma vez");
        System.out.println("######### FABRICAÇÃO DE VEÍCULOS #########");
    }

    public abstract void fabricar();
    

    public Veiculo(Motor motor, Roda rodas, String chassi) {
        this.motor = motor;
        this.rodas = rodas;
        this.chassi = chassi;
    }

    public static int getAnoDeFabricacao(){
        return ANO_DE_FABRICACAO;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda getRodas() {
        return rodas;
    }

    public void setRodas(Roda rodas) {
        this.rodas = rodas;
    }

    public String getChassi() {
        return chassi;
    }

}
