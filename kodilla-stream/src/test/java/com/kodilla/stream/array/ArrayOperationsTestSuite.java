package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int[] numbers = {4, 5, 1, 9, 15, 22, 19, 1, 0, 42, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //When
        OptionalDouble average = ArrayOperations.getAverage(numbers);

        //Then
        OptionalDouble expectedValue = OptionalDouble.of(8.65);
        assertEquals(expectedValue, average);
    }

}
