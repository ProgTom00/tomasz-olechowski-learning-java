package com.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreRunner {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String result = movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining("! ", "", "!"));

        System.out.println(result);

    }
}
