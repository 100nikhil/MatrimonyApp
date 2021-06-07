package com.matrimony.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static Date convert(String s) throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse(s);
        return date;
    }
}
