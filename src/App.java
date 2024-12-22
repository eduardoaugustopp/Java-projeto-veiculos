import br.com.veiculos.model.Carro;
import br.com.veiculos.model.Moto;
import br.com.veiculos.model.Motor;
import br.com.veiculos.model.Roda;

public class App {
    public static void main(String[] args) throws Exception {

        Motor motor1 = new Motor("Elétrico", 762);

        Roda roda1 = new Roda("Alumínio", 19, 4);

        System.out.println();

        Moto moto1 = new Moto(motor1, roda1, "1HGCM82633A123456", false, false);

        Carro carro1 = new Carro(motor1, roda1, "1HGCM82633A678942", 02, true);

        Carro carro2 = new Carro(motor1, roda1, "1HGCM82633A678942", 02, true);

        // saida.informacoesViewVeiculo(moto1);

        // VeiculoController veiculo1 = new VeiculoController();
        // veiculo1.adicionarVeiculo(new Veiculo(motor1, roda1, "1HGCM82633A123456"));

        // VeiculoController veiculo2 = new VeiculoController();
        // veiculo2.adicionarVeiculo(new Veiculo(motor1, roda1, "1HGCM82633A678942"));

        moto1.fabricar();
        System.out.println();
        carro1.fabricar();
        System.out.println();
        carro2.fabricar();
        System.out.println();
        carro1.instalar();
        System.out.println();

        moto1.instalar();

    }
}
