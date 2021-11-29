package com.learning.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Testing Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Testing Case: end");
    }

    @DisplayName("Checking empty array")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> list = oddNumbers.exterminate(emptyList);
        System.out.println("Testing empty array: " + list);
        //Then
        Assertions.assertEquals(emptyList, list);

    }

    @DisplayName("Checking filled array")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(10, 20));
        //When
        List<Integer> correctResult = oddNumbers.exterminate(arrayList);
        System.out.println("Testing filled array " + correctResult);
        //Then
        Assertions.assertEquals(expectedList, correctResult);
    }
}
