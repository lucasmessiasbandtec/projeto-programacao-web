package com.lucas.projetosprint01;

public class Literatura extends Obra {

    //Construtor
    public Literatura(String nome, String artista, Integer anoDeCriacao, String movimentoArtistico) {
        super(nome, artista, anoDeCriacao, movimentoArtistico);
    }

    //Método
    @Override
    public String toString() {
        return "\nLiteratura {" + super.toString() + "\n}";
    }
}
