package main.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CrazyLogger {

    private String name;
    private StringBuilder exceptionMessages = new StringBuilder();
    private final String FORMAT = "dd.MM.YYYY : hh-mm - ";
    private final String MESSAGE_NOT_FOUND = "message not found";
    private final String EMPTY_MESSAGE = "empty message";

    public CrazyLogger(String name) {
        this.name = name;
    }

    public String getFormatCurrentDate() {
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

    public String findExceptionMessage(String message) {
        if (!message.equals("")) {
            if (toString().contains(message)) {
                return exceptionMessages.substring((exceptionMessages.indexOf(message) - 21),
                        exceptionMessages.indexOf(message)) + message + ";";
            } else {
                return MESSAGE_NOT_FOUND;
            }
        } else {
            return EMPTY_MESSAGE;
        }
    }

    @Override
    public String toString() {
        return exceptionMessages.toString();
    }

}
