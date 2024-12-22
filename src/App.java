import br.com.veiculos.controller.CarroController;
import br.com.veiculos.model.Carro;
import br.com.veiculos.model.Moto;
import br.com.veiculos.model.Motor;
import br.com.veiculos.model.Roda;
import br.com.veiculos.view.CarroView;
import br.com.veiculos.view.MotoView;

public class App {
    public static void main(String[] args) throws Exception {

        Motor motor1 = new Motor("Elétrico", 762);

        Roda roda1 = new Roda("Alumínio", 19, 4);

        System.out.println();

        Moto moto1 = new Moto(motor1, roda1, "1HGCM82633A123456", false, false);

        Carro carro1 = new Carro(motor1, roda1, "1HGCM82633A678942", 02, true);

        Carro carro2 = new Carro(motor1, roda1, "1HGCM82633A678942", 04, true);

        // saida.informacoesViewVeiculo(moto1);

        // VeiculoController veiculo1 = new VeiculoController();
        // veiculo1.adicionarVeiculo(new Veiculo(motor1, roda1, "1HGCM82633A123456"));

        // VeiculoController veiculo2 = new VeiculoController();
        // veiculo2.adicionarVeiculo(new Veiculo(motor1, roda1, "1HGCM82633A678942"));

        CarroView carroView = new CarroView();
        MotoView motoView = new MotoView();

        CarroController carroController = new CarroController(carroView);

        carroController.fabricarCarro();

        moto1.fabricar();
        System.out.println();
        carro1.fabricar();

        

        carroView.fabricacaoConcluida(carro1);
        carroView.fabricacaoConcluida(carro2);
        motoView.fabricacaoConcluida(moto1);


        System.out.println();
        carro2.fabricar();
        System.out.println();
        carro1.instalar();
        System.out.println();

        moto1.instalar();

    }
}
