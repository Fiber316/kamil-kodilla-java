package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    public final BigDecimal peopleQuantity;
    public final String name;

    public Country(String name, BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }
    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }
}
