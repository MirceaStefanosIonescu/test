package ionescu_stefanosv2_individual_parta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

import java.util.Date;


public class DateUtilities {

    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public static Date convertedDateFromString(String date) {

        try {
            //to SimpleDateFormat einai o Constructor (einai i morfi tou xronou pou dilono)
            Date result = formatter.parse(date);

            return result;
        } catch (ParseException ex) {
            System.out.println("Please Try again to give Correct Date Format (dd/MM/YYYY)");
        }
        return null;
    }

    public static LocalDate convertedDateToLocalDate(String date) throws ParseException {

        LocalDate result = LocalDate.parse(date);

        return result;
    }

    public static String convertDateToString(Date date) {

        String result = formatter.format(date);
        return result;
    }

    public static LocalDate convertedLocalDateFromDateSimple(Date date) {

        LocalDate localDateFromDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        LocalDate result = localDateFromDate;

        return result;
    }

    public static String formatteredLocalDateFromDate(LocalDate date) {

        String result = formatter.format(date);
        return result;
    }
}
