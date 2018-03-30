package test.java;

import main.java.CrazyLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForCrazyLogger {

    private CrazyLogger crazyLogger;
    private Exception exception;

    @BeforeEach
    void setUp() {
        crazyLogger = new CrazyLogger("crazy");
        exception = new IOException();
    }

    @Test
    @DisplayName("Test for StackTraceLog")
    void testForStackTraceLog() {
        crazyLogger.stackTraceLog(exception);
        assertTrue(crazyLogger.toString().contains("test.java.TestForCrazyLogger.setUp(TestForCrazyLogger.java:21)"));
        System.out.println(crazyLogger.toString());

    }

    @Test
    @DisplayName("Test for findExceptionMessage")
    void testForFindExceptionMessage() {
        crazyLogger.stackTraceLog(exception);
        assertTrue(crazyLogger.findExceptionMessage("TestForCrazyLogger").contains("TestForCrazyLogger"));
    }

    @Test
    @DisplayName("Test for findExceptionMessage with empty message")
    void testForFindExceptionMessageWithEmptyMessage(){
        crazyLogger.stackTraceLog(exception);
        assertTrue(crazyLogger.findExceptionMessage("").contains("empty message"));
    }

    @Test
    @DisplayName("Test for findExceptionMessage with wrong message")
    void testForFindExceptionMessageWithWrongMessage(){
        crazyLogger.stackTraceLog(exception);
        assertTrue(crazyLogger.findExceptionMessage("hgjfhkj").contains("message not found"));
    }

    @Test
    @DisplayName("Test for getFormatCurrentDate")
    void testForGetFormatCurrentDate(){
        assertTrue(crazyLogger.getFormatCurrentDate().contains("2018"));
    }




}
