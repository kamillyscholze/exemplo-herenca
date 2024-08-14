import modelos.Animal;
import modelos.Cachorro;
import modelos.Gato;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro = new Cachorro("Nelson", "vira-lata", 1);
        Gato gato = new Gato();

        // System.out.println(cachorro.toString());
        // System.out.println(gato.toString());
        // System.out.println(cachorro instanceof Animal);
        // System.out.println(gato instanceof Animal);

        System.out.println(cachorro.som());
        System.out.println(gato.som());
    }
}
