package com.learning.testing.shape;

import org.junit.jupiter.api.*;
import java.util.Arrays;

@DisplayName("TDD: Forum Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test the list modification")
    class TestModified {

        @Test
        public void testAddShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square("Square", 16.0);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesListQuantity());
        }

        @Test
        public void testRemoveShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Triangle("Triangle", 14.0);
            shapeCollector.addFigure(shape1);
            //When
            boolean isRemoved = shapeCollector.removeFigure(shape1);
            //Then
            Assertions.assertTrue(isRemoved);
            Assertions.assertEquals(0, shapeCollector.getShapesListQuantity());
        }
    }

    @Nested
    @DisplayName("Tests showing the results")
    class TestDisplay {

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 20.0);
            shapeCollector.addFigure(shape);
            //When
            Shape getFigure = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, getFigure);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape shape1 = new Square("Square", 16.0);
            Shape shape2 = new Circle("Circle", 20.0);
            Shape shape3 = new Triangle("Triangle", 14.0);

            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);
            //When
            String result = shapeCollector.showFigures();

            Shape[] shapes = {shape1, shape2, shape3};
            String expectedResult = Arrays.toString(shapes);
            //Then
            Assertions.assertEquals(result, expectedResult);
        }
    }
}
