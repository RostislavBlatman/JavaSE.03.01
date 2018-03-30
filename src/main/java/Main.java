package main.java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CrazyLogger crazyLogger = new CrazyLogger("example");
        IOException ioexception = new IOException();
    try{
        int example = 1/0;
    }catch (Exception exception){
            crazyLogger.stackTraceLog(exception);
            System.out.println(crazyLogger.toString());
    }
    try {
        int example = 1/0;

    }catch (Exception exception){
        crazyLogger.stackTraceLog(exception);
        crazyLogger.stackTraceLog(ioexception);
        System.out.println(crazyLogger.findExceptionMessage(""));
        System.out.println(crazyLogger.toString());
    }
    }
}
