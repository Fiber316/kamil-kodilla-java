package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.calculator;


public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int addTest = calculator.add(2, 3);
        if (addTest == 5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int subtractTest = calculator.subtract(5, 3);
        if (subtractTest == 2) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}