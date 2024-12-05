package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLogOneLog() {
        // Given
        Logger logger = Logger.INSTANCE;
        String testLog = "test log";

        // When
        logger.log(testLog);
        String lastLog = logger.getLastLog();

        // Then
        Assertions.assertEquals(testLog, lastLog);
    }
    @Test
    public void testGetLastLogTwoLogs() {
        // Given
        Logger logger = Logger.INSTANCE;
        String firstTestLog = "First test log";
        String secondTestLog = "Second test log";

        // When
        logger.log(firstTestLog);
        logger.log(secondTestLog);
        String lastLog = logger.getLastLog();

        // Then
        Assertions.assertEquals(secondTestLog, lastLog);
    }
}
