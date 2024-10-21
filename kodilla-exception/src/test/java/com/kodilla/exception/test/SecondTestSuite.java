package com.kodilla.exception.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondTestSuite {

    @Test
    void testValidValues() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertDoesNotThrow(() -> {
            String result = secondChallenge.probablyIWillThrowException(1.5, 1.0);
            assertEquals("Done!", result);
        });
    }

    @Test
    void testXOver() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertThrows(Exception.class, () -> {
            secondChallenge.probablyIWillThrowException(2.0, 1.0);
        });
    }

    @Test
    void testXUnder() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertThrows(Exception.class, () -> {
            secondChallenge.probablyIWillThrowException(0.9, 1.0);
        });
    }

    @Test
    void testY1Point5() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        assertThrows(Exception.class, () -> {
            secondChallenge.probablyIWillThrowException(1.5, 1.5);
        });
    }
}