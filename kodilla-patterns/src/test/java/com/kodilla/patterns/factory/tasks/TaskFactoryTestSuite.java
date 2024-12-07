package com.kodilla.patterns.factory.tasks;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testMakeShoppingTaskWithoutExecuting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals(false, shopping.isTaskExecuted());

    }

    @Test
    void testMakeAndExecuteShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());

    }

    @Test
    void testMakePaintingTaskWithoutExecuting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertEquals(false, painting.isTaskExecuted());

    }

    @Test
    void testMakeAndExecutePaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted());

    }

    @Test
    void testMakeDrivingTaskWithoutExecuting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Driving", driving.getTaskName());
        assertEquals(false, driving.isTaskExecuted());

    }

    @Test
    void testMakeAndExecuteDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals("Driving", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());

    }


}
