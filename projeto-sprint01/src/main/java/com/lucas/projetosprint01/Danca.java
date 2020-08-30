package com.lucas.projetosprint01;

public class Danca extends Obra {

    //Construtor
    public Danca(String nome, String artista, Integer anoDeCriacao, String movimentoArtistico) {
        super(nome, artista, anoDeCriacao, movimentoArtistico);
    }

    //Método
    @Override
    public String toString() {
        return "\nDança {" + super.toString() + "\n}";
    }
}
