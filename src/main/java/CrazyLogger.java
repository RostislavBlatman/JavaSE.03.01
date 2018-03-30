package main.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CrazyLogger {

    private String name;
    private StringBuilder exceptionMessages = new StringBuilder();
    private final String FORMAT = "dd.mm.YYYY : hh:mm - ";

    public CrazyLogger(String name){
        this.name = name;
    }

    private String getFormatCurrentDate(){
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow =
                new SimpleDateFormat(FORMAT);
        return formatForDateNow.format(dateNow);
    }


    public void stackTraceLog(Throwable exception) {
        exceptionMessages.append(getFormatCurrentDate());
        for (StackTraceElement element : exception.getStackTrace()) {
            exceptionMessages.append(element.toString());
            exceptionMessages.append(";\n");
        }

    }

    public String findExceptionMessage (String message){
       if(toString().contains(message)) {
           return getFormatCurrentDate() + message + ";";
       }else {
           return "message not found";
       }
    }

    @Override
    public String toString() {
        return exceptionMessages.toString();
    }
}
