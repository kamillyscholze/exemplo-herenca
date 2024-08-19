package modelos;

import modelos.Veiculo;

public class Carro extends Veiculo {

    private Integer numPortas;

    public Carro(int numPortas, String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);

        this.numPortas = numPortas;
    }

    public Integer getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(Integer numPortas) {
        this.numPortas = numPortas;
    }

    veiculo = Veiculo(null, null, null);

}
