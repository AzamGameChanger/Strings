package com.codewithazam;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeBaby {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        SimpleDateFormat format = new SimpleDateFormat("E dd-MM-yyyy hh:mm:ss a zzz");
        System.out.println(format.format(today));

    }
}
