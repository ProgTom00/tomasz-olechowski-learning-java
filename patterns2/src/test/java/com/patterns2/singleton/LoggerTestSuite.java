package com.patterns2.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void testLog() {
        logger = Logger.INSTANCE;
        logger.log("test first log");
        logger.log("test second log");
    }

    @Test
    void testGetLastLog() {
        // Given
        // When
        String log = logger.getLastLog();
        // Then
        assertEquals("test second log", log);
    }
}