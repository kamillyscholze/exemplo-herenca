package modelos;

public class Animal {
    protected String nome;
    protected String raca;
    protected Integer idade;

    public Animal(String nome, String raca, Integer idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String som() {
        return "Emite um som: ..";
    }
}