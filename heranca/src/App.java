import modelos.Veiculo;
import modelos.Moto;
import modelos.Carro;

public class App {
    public static void main(String[] args) throws Exception {

        Veiculo veiculo = new Veiculo(null, null, null);
        Gato gato = new Gato();

        // System.out.println(cachorro.toString());
        // System.out.println(gato.toString());
        // System.out.println(cachorro instanceof Animal);
        // System.out.println(gato instanceof Animal);

        System.out.println(cachorro.som());
        System.out.println(gato.som());
    }
}
