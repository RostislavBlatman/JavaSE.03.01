package main.java;

public class Main {
    public static void main(String[] args) {
        CrazyLogger cl = new CrazyLogger("example");
    try{
        int example = 1/0;
    }catch (Exception exception){
            cl.stackTraceLog(exception);
            System.out.println(cl.toString());
    }
    try {
        int example = 1/0;

    }catch (Exception exception){
        cl.stackTraceLog(exception);
        System.out.println(cl.toString());
    }
    }
}
