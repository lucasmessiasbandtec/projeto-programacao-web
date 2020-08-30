package com.lucas.projetosprint01;

public class Musica extends Obra {

    //Construtor
    public Musica(String nome, String artista, Integer anoDeCriacao, String movimentoArtistico) {
        super(nome, artista, anoDeCriacao, movimentoArtistico);
    }

    //Método
    @Override
    public String toString() {
        return "\nMúsica {" + super.toString() + "\n}";
    }
}
