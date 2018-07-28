package com.example.android.popularmoviesstage1;

import android.content.Context;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateTimeHelper {

    /**
     * Returns a Date object
     *
     * @param date   Date to be formatted
     * @param format Format of the date to be formatted
     * @return Date object
     * @throws ParseException
     */
    private static Date getFormattedDate(String date, String format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        return simpleDateFormat.parse(date);
    }

    /**
     * Returns date in short form based on the device settings.
     *
     * @param context Application context
     * @param date    Date to be formatted
     * @param format  Format of the date to be formatted
     * @return String representation of date
     * @throws ParseException
     */
    public static String getLocalizedDate(Context context, String date, String format)
            throws ParseException {
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(context);

        return dateFormat.format(getFormattedDate(date, format));
    }
}

