package com.barbeariatoledo.BarbeariaAPI.Tools;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class DateFormatter {
    public DateTimeFormatter dateFormatter(){
        // creditos para assylias - StackOverflow
        DateTimeFormatter fmt = new DateTimeFormatterBuilder()
                .appendPattern("dd/MM/yyyy")
                .optionalStart()
                .appendPattern(" HH:mm")
                .optionalEnd()
                .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
                .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
                .toFormatter();

        return fmt;
    }
}
