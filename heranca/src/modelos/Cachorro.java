package modelos;

public class Cachorro extends Animal {
    public String casinha;

    public Cachorro(String nome, String raca, Integer idade) {
        super(nome, raca, idade);

        this.casinha = "pano";
    }

    public String som() {
        return super.som() + "au au";
    }

    public String toString() {
        return this.nome + " - " + this.raca + " - " + this.idade;
    }
}
