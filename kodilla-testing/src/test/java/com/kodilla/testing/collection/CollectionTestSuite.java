package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;

class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when the list is empty, list after exterminator should also be empty"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> emptyList = Arrays.asList();

        //When
        List<Integer> result = exterminator.exterminate(emptyList);
        System.out.println("Testing empty list");

        //Then
        Assertions.assertTrue(result.isEmpty());

    }

    @DisplayName("when the list has numbers from 1 to 10, list after exterminator should have 2, 4, 6, 8, 10"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);
        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        System.out.println("Testing list containing natural numbers from 1 to 10");
        Assertions.assertEquals(expected, result);

    }
}
