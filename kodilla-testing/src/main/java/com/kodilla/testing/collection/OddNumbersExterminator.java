package com.kodilla.testing.collection;

import java.util.List;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer numberTested : numbers) {
            if (numberTested % 2 == 0) {
                evenNumbers.add(numberTested);
            }
        }

        return evenNumbers;
    }
}