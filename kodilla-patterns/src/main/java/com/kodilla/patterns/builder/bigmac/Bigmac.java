package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final String bun;
    private final int burgers;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();

        public Bigmac.BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public Bigmac.BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public Bigmac.BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String toString() {
        return "Bigmac{" +
                "bun'" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", ingredients=" + ingredients +
                '}';

    }
}
