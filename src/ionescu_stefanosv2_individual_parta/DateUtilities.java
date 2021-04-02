package ionescu_stefanosv2_individual_parta;


import static ionescu_stefanosv2_individual_parta.Main.assigmentsAll;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public  class DateUtilities {
    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public static Date convertedDateFromString(String date) throws ParseException {

        //to SimpleDateFormat einai o Constructor (einai i morfi tou xronou pou dilono)
        Date result = formatter.parse(date);

        return result;
    }

    public static LocalDate convertedDateToLocalDate(String date) throws ParseException {

        LocalDate result = LocalDate.parse(date);

        return result;
    }


    public static String convertDateToString(Date date){
    
    String result=formatter.format(date);
    return result;
    }
    
    
    public static LocalDate convertedLocalDateFromDateSimple(Date date){
        
        
     LocalDate localDateFromDate = date.toInstant()
                  .atZone(ZoneId.systemDefault())
                  .toLocalDate();
   
        
    LocalDate    result = localDateFromDate;
   
    
     return   result;
    }
    public static String formatteredLocalDateFromDate(LocalDate date){
    
    String result=formatter.format(date);
         return   result;
    }
}

      //  Assignment assigment0 = new Assignment("title1", "description1", "01/03/2021", "08/03/2021", "07/03/2021", 32, 78);
      //  Assignment assigment1 = new Assignment("title1", "description1", "01/03/2021", "08/03/2021", "07/03/2021", 32, 78);
      //  assigmentsAll.add(assigment0);
      //  assigmentsAll.add(assigment1);

      //  LocalDate dateTest = DateUtilities.convertedLocalDateFromDate(assigmentsAll.get(1).getDeadLine());
      //  System.out.println(dateTest);
        