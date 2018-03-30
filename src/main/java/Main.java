package main.java;

public class Main {
    public static void main(String[] args) {
        CrazyLogger crazyLogger = new CrazyLogger("example");
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
        System.out.println(crazyLogger.toString());
    }
    }
}
