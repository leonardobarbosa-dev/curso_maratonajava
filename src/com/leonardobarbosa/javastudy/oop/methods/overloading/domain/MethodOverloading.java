package com.leonardobarbosa.javastudy.oop.methods.overloading.domain;

public class MethodOverloading {

    /*
    Sobrecarga de metodos usa o mesmo name com uma
    quantidade ou tipo dos parametros diferentes
     */

    private String name;
    private String genre;
    private int seasons;
    private int episodes;

    public void init(String name, String genre, int seasons) {
        this.name = name;
        this.genre = genre;
        this.seasons = seasons;
    }

    public void init(String name, String genre, int seasons, int episodes) {
        this.init(name, genre, seasons);
        this.episodes = episodes;
    }

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
