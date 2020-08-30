package com.lucas.projetosprint01;

public class Pintura extends Obra implements Compravel {

    //Atributo
    private String tecnicaDePintura;

    //Construtor
    public Pintura(String nome, String artista, Integer anoDeCriacao, String movimentoArtistico, String tecnicaDePintura) {
        super(nome, artista, anoDeCriacao, movimentoArtistico);
        this.tecnicaDePintura = tecnicaDePintura;
    }

    //Métodos
    // O método getValorPreco() retorna o valor inicial da compra, 5000 reais, mais o valor do tipo da obra
    @Override
    public Double getValorPreco() {
        return 5000.0 + 500.0;
    }

    @Override
    public String toString() {
        return "\nPintura {" +
                super.toString() +
                "\nTécnica de pintura = " + tecnicaDePintura +
                "\nValor da obra = R$" + getValorPreco() +
                "\n}";
    }

    //Getters e Setters
    public String getTecnicaDePintura() {
        return tecnicaDePintura;
    }

    public void setTecnicaDePintura(String tecnicaDePintura) {
        this.tecnicaDePintura = tecnicaDePintura;
    }
}
