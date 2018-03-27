package main.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CrazyLogger {

    private String name;
    private StringBuilder exceptionMessages = new StringBuilder();

    public CrazyLogger(String name){
        this.name = name;
    }

    private String getCurrentDate(){
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow =
                new SimpleDateFormat("dd.mm.YYYY : hh:mm - ");
        return formatForDateNow.format(dateNow);
    }


    public void stackTraceToString(Throwable exception) {
        exceptionMessages.append(getCurrentDate());
        for (StackTraceElement element : exception.getStackTrace()) {
            exceptionMessages.append(element.toString());
            exceptionMessages.append("\n");
        }

    }

    public boolean find (String message){
        return toString().contains(message);
    }

    @Override
    public String toString() {
        return exceptionMessages.toString();
    }
}
