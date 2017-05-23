package com.codeclan.example.movierankings;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class RankingTest {
    @Test
    public void checkArrayStartsEmpty() {
        Ranking movieRankings = new movieRankings();
        assertNotNul(movieRankings.countMovies());
    }
}