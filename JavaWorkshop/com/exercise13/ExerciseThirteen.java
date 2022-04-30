package com.exercise13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExerciseThirteen {
    public void localDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.print("Current local date and time: " + dtf.format(LocalDateTime.now()));
    }
}