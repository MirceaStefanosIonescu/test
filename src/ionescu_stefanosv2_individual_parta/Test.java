package ionescu_stefanosv2_individual_parta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        ArrayList<LocalDate> dates = new ArrayList<>();

        ///
        dates.add(LocalDate.parse("10/04/2021", formatter));
        dates.add(LocalDate.parse("15/04/2021", formatter));
        dates.add(LocalDate.parse("16/04/2021", formatter));
        dates.add(LocalDate.parse("09/04/2021", formatter));
        dates.add(LocalDate.parse("01/05/2021", formatter));

        LocalDate dateD = LocalDate.parse("16/04/2021", formatter);

        int test = (dateD.getDayOfWeek().getValue());
        //kurianki einai
        LocalDate startOfWeek = dateD.minusDays(test);

        //sabbato
        LocalDate endOfWeek = dateD.plusDays(6 - test);

        for (LocalDate dateIn : dates) {

            if (dateIn.isAfter(startOfWeek) && dateIn.isBefore(endOfWeek)) {

                System.out.println(dateIn);

            }
        }
    }

}
