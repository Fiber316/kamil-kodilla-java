package com.kodilla.stream.world;

import com.kodilla.stream.sand.Africa;
import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));
        Country france = new Country("France", new BigDecimal("60000000"));
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        Continent asia = new Continent("Asia");
        Country china = new Country("China", new BigDecimal("2000000000"));
        Country japan = new Country("Japan", new BigDecimal("100000000"));
        Country southKorea = new Country("South Korea", new BigDecimal("60000000"));
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(southKorea);

        Continent africa = new Continent("Africa");
        Country egypt = new Country("Egypt", new BigDecimal("100000000"));
        Country southAfrica = new Country("South Africa", new BigDecimal("60000000"));
        Country morocco = new Country("Morocco", new BigDecimal("30000000"));
        africa.addCountry(egypt);
        africa.addCountry(southAfrica);
        africa.addCountry(morocco);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("2530000000");
        assertEquals(expectedPeopleQuantity, worldPeopleQuantity);
    }
}
