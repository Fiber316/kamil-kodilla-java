package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame")
                .burgers(2)
                .ingredient("Cheese")
                .ingredient("Tomato")
                .ingredient("Sauce")
                .ingredient("Pickle")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyIngredients);
        assertEquals("With sesame", bigmac.getBun());
    }
}
