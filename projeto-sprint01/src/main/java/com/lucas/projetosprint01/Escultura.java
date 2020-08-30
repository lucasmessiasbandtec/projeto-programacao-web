package com.lucas.projetosprint01;

public class Escultura extends Obra implements Compravel {

    //Atributo
    private String material;

    //Construtor
    public Escultura(String nome, String artista, Integer anoDeCriacao, String movimentoArtistico, String material) {
        super(nome, artista, anoDeCriacao, movimentoArtistico);
        this.material = material;
    }

    //Métodos
    // O método getValorPreco() retorna o valor inicial da compra, 5000 reais, mais o valor do tipo da obra
    @Override
    public Double getValorPreco() {
        return 5000.0 + 700.0;
    }

    @Override
    public String toString() {
        return "\nEscultura {" +
                super.toString() +
                "\nMaterial = " + material +
                "\nValor da obra = R$" + getValorPreco() +
                "\n} ";
    }

    //Getters e Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
