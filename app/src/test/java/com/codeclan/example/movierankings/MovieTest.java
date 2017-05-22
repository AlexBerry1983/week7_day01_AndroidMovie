package com.codeclan.example.movierankings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */

public class MovieTest {

    @Test
    public void canGetTitle() {
        Movie movie = new Movie("Alien Covenant", "Horror", 1);
        assertEquals("Alien Covenant", movie.getTitle());
    }

    @Test
    public void canSetTitle() {
        Movie movie = new Movie("Alien Covenant", "Horror", 1);
        movie.setNewTitle("Suicide Squad");
        assertEquals("Suicide Squad", movie.getTitle());
    }

    @Test
    public void canGetGenre() {
        Movie movie = new Movie("Alien Covenant", "Horror", 1);
        assertEquals("Horror", movie.getGenre());
    }

    @Test
    public void canSetNewGenre() {
        Movie movie = new Movie("Alien Covenant", "Horror", 1);
        movie.setNewGenre("Sci-fi");
        assertEquals("Sci-fi", movie.getGenre());
    }

    @Test
    public void canGetRanking() {
        Movie movie = new Movie("Alien Covenant", "Horror", 1);
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void canSetRanking() {
        Movie movie = new Movie("Alien Covenant", "Horror", 1);
        movie.setNewRanking(2);
        assertEquals(2, movie.getRanking());
    }
    
}