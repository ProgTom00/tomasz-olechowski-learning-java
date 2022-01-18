package com.patterns2.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        // Given
        TaskFactory factory = new TaskFactory();
        // When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        assert drivingTask != null;
        drivingTask.executeTask();
        // Then
        assertEquals("Driving", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        // Given
        TaskFactory factory = new TaskFactory();
        // When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        assert shoppingTask != null;
        shoppingTask.executeTask();
        // Then
        assertEquals("Grocery shopping", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());

    }

    @Test
    void testFactoryPaintingTask() {
        // Given
        TaskFactory factory = new TaskFactory();
        // When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        assert paintingTask != null;
        paintingTask.executeTask();
        // Then
        assertEquals("Painting", paintingTask.getTaskName());
        assertNotEquals(false, paintingTask.isTaskExecuted());
    }
}
