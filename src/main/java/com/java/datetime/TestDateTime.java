package com.java.datetime;

import java.time.*;

/**
 * Created by PXV8340 on 10/14/2015.
 */
public class TestDateTime {
    public static void main (String args[]) {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
        System.out.println(clock.millis());


        LocalDate localDate = LocalDate.now();
        LocalDate localDateFromClock = LocalDate.now(clock);
        System.out.println("LOCAL DATE.....");
        System.out.println(localDate);
        System.out.println(localDateFromClock);

        LocalTime localTime = LocalTime.now();
        LocalTime localTimeFromClock = LocalTime.now(clock);
        System.out.println("LOCAL TIME......");
        System.out.println(localTime);
        System.out.println(localTimeFromClock);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimeFromClock = LocalDateTime.now(clock);
        System.out.println("LOCAL DATE TIME......");
        System.out.println(localDateTime);
        System.out.println(localDateTimeFromClock);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeFromClock = ZonedDateTime.now(clock);
        ZonedDateTime zonedDateTimeFor = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("ZonedDateTime....");
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTimeFromClock);
        System.out.println(zonedDateTimeFor);


        //Duration between two dates
        LocalDateTime from = LocalDateTime.of(1973, 8, 29, 12, 0, 0, 0);
        LocalDateTime to = LocalDateTime.now();

        Duration duration  = Duration.between(from,to);

        System.out.println("Duration in days: " + duration.toDays());
        System.out.println("Duration in hours: " + duration.toHours());

    }
}
