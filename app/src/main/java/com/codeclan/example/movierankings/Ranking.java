package com.codeclan.example.movierankings;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 22/05/2017.
 */

public class Ranking {

    private ArrayList<Movie> movieRankings;

    public Ranking() {
        this.movieRankings = new ArrayList<>();
    }
    public int countMovies() {
        return movieRankings.size();
    }
}

    private void setupDefaultMovies() {
        Movie[] defaultMovies = {

        }
    }

//public class AnswerProvider implements AnswerProviding {
//    private ArrayList<String> answers;
//
//    public AnswerProvider(ArrayList<String> answers) {
//        this.answers = answers;
//    }
//
//    public AnswerProvider() {
//        this.answers = new ArrayList<>();
//        setupDefaultAnswers();
//    }
//
//    private void setupDefaultAnswers() {
//        String[] defaultAnswers = {
//                "You bet your ass!",
//                "No"
//        };
//        for (String answer : defaultAnswers) {
//            this.answers.add(answer);
//        }
//    }
//
//    public ArrayList<String> getAnswers() {
//        return new ArrayList<>(this.answers);
//    }
//
//    public int getNumberOfAnswers() {
//        return this.answers.size();
//    }
//
//    public void add(String answer) {
//        this.answers.add(answer);
//    }
//
//    public String getAnswerAtIndex(int i) {
//        return this.answers.get(i);
//    }
//
//    public String getAnswer() {
//        Random rand = new Random();
//        int index = rand.nextInt(getNumberOfAnswers());
//        return getAnswerAtIndex(index);
//    }
//}