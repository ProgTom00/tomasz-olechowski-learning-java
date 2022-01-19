package com.learning.testing.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testLoopAndConditionalBreakPoints {

    @Test
    public void testLoop() {
        // Given
        long sum = 0;
        for(int i = 0; i < 1000; i++) {
            sum+= i;
            System.out.println("[ " + i + "] sum equals: " + sum);
        }
        // Then
        Assertions.assertEquals(499500,sum);
    }
}
