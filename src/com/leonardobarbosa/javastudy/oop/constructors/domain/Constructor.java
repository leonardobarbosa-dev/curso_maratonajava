package com.leonardobarbosa.javastudy.oop.constructors.domain;

public class Constructor {

    private String name;
    private String genre;
    private int seasons;
    private int episodes;

    /*
    Construtor sempre inicia com public e o name da classe
    (não tem metodo de retorno)
     */

    public Constructor(String name, String genre, int seasons, int episodes) {
        this.name = name;
        this.genre = genre;
        this.seasons = seasons;
        this.episodes = episodes;
    }

//    Metodo impressao

    public void imprimir() {
        System.out.printf("\nAnime: %s | Gênero: %s | Temporadas: %d | Episódios: %d\n",
                this.name,
                this.genre,
                this.seasons,
                this.episodes);
    }


//    Metodos getters e setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
