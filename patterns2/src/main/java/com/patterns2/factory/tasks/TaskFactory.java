package com.patterns2.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Grocery shopping", "Carrot", 10);
            case PAINTING:
                return new PaintingTask("Painting", "Navy Blue", "Car");
            case DRIVING:
                return new DrivingTask("Driving", "Cracow", "Car");
            default:
                return null;
        }
    }
}

