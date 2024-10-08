package modelos;

public class Veiculo {
    private String marca;
    private String modelo;
    private Integer ano;

    public Veiculo(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String exibirDetalhes() {
        return ("Marca: " + marca + " \nModelo: " + modelo + " \nAno: " + ano + "");
    };
}
