package com.learning.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        // Given
        int[] array = new int[20];
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
            number++;
        }
        // When
        double average = ArrayOperations.getAverage(array);
        double averageResult = 10.5;

        // Then
        Assertions.assertEquals(averageResult, average, 0.001);
    }
}

