package main.java;

public class Main {
    public static void main(String[] args) {
        CrazyLogger cl = new CrazyLogger("example");
    try{
        int example = 1/0;
    }catch (Exception e){
            cl.stackTraceToString(e);
            System.out.println(cl.toString());
    }
    try {
        int ex = 1/0;

    }catch (Exception e){
        cl.stackTraceToString(e);
        System.out.println(cl.toString());
    }
    }
}
