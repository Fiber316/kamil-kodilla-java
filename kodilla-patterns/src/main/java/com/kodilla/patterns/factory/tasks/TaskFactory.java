package com.kodilla.patterns.factory.tasks;


public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Shopping", "potatoes", 10);
            case PAINTING -> new PaintingTask("Painting", "white", "wall");
            case DRIVING -> new DrivingTask("Driving", "cinema", "car");
            default -> null;
        };
    }
}
