package com.lucas.projetosprint01;

public class Cinema extends Obra {

    //Atributo
    private String genero;

    //Construtor
    public Cinema(String nome, String artista, Integer anoDeCriacao, String movimentoArtistico, String genero) {
        super(nome, artista, anoDeCriacao, movimentoArtistico);
        this.genero = genero;
    }

    //Método
    @Override
    public String toString() {
        return "\nCinema {" +
                super.toString() +
                "\nGênero = " + genero +
                "\n} ";
    }

    //Getters e Setters
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
