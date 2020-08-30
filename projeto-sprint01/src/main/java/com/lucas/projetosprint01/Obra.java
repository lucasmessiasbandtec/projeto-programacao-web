package com.lucas.projetosprint01;

public abstract class Obra{

    //Atributos
    private String nome;
    private String artista;
    private Integer anoDeCriacao;
    private String movimentoArtistico;

    //Construtor
    public Obra(String nome, String artista, Integer anoDeCriacao, String movimentoArtistico) {
        this.nome = nome;
        this.artista = artista;
        this.anoDeCriacao = anoDeCriacao;
        this.movimentoArtistico = movimentoArtistico;
    }

    // Métodos
    @Override
    public String toString() {
        return  "\nNome da obra = " + nome +
                "\nArtista = " + artista +
                "\nAno de criação = " + anoDeCriacao +
                "\nMovimento artístico = " + movimentoArtistico;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getMovimentoArtistico() {
        return movimentoArtistico;
    }

    public void setMovimentoArtistico(String movimentoArtistico) {
        this.movimentoArtistico = movimentoArtistico;
    }
}
