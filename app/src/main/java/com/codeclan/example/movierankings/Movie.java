package com.codeclan.example.movierankings;

/**
 * Created by user on 22/05/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setNewTitle(String newTitle) {
        title = newTitle;
    }

    public void setNewGenre(String newGenre) {
        genre = newGenre;
    }

    public void setNewRanking(int newRanking) {
        ranking = newRanking;
    }

}
