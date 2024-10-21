package com.kodilla.exception.test;

public class ExceptionHandling {

    public void handleException() {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(1.5, 1.0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Program done");
        }
    }
}