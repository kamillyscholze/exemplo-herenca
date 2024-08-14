package modelos;

public class Gato extends Animal {

    public Gato() {
        super(null, null, null);
    }

    public String som() {
        return super.som() + "miau miau";
    }

    public String toString() {
        return this.nome + " - " + this.raca + " - " + this.idade;
    }

}
