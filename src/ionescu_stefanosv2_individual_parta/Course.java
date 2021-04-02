package ionescu_stefanosv2_individual_parta;

import java.text.ParseException;
import java.util.Date;

public class Course {

    private String title;
    private String stream;
    private String type;
    private Date start_date;
    private Date end_date;

    public Course(String title, String stream, String type, String start_date, String end_date) throws ParseException {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = DateUtilities.convertedDateFromString(start_date);
        this.end_date = DateUtilities.convertedDateFromString(end_date);
    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;

    }

    public void setStream(String stream) {
        this.stream = stream;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartasDate() {
        return start_date;

    }

    public void setStartDateAsDate(Date start_date) {
        this.start_date = start_date;

    }

    public void setStartDateAsString(String start_date) throws ParseException {
        this.start_date = DateUtilities.convertedDateFromString(start_date);
    }

    public Date getEndDate() {
        return end_date;
    }

    public void setEndDate(Date end_date) {

        this.end_date = end_date;

    }

}
