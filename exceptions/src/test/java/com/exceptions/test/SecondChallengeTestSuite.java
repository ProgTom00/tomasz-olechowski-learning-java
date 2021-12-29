package com.exceptions.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {
    @DisplayName("Test method probablyIWillThrowException with value of x = 1, and y = 1.7")

    @Test
    void testProbablyIWillThrowExceptionFirstTest() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When && Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 1.7));
    }

    @DisplayName("Test method probablyIWillThrowException with value of x = 2, and y = 1.7")

    @Test
    void testProbablyIWillThrowExceptionSecondTest() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When && Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.7));
    }

    @DisplayName("Test method probablyIWillThrowException with value of x = 1.5 and y = 1.5")

    @Test
    void testProbablyIWillThrowExceptionThirdTest() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When && Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5));
    }

    @DisplayName("Test method probablyIWillThrowException with value of x = 1.0 and y = 1.5")

    @Test
    void testProbablyIWillThrowExceptionFourthTest() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 1.5));
    }
}
