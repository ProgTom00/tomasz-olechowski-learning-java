package com.learning.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

        OptionalDouble average = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average();


        return average.getAsDouble();
    }
}