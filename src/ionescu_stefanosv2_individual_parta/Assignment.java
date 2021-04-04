package ionescu_stefanosv2_individual_parta;

import java.text.ParseException;


import java.util.Date;


public class Assignment {

    private String title;
    private String description;
    private Date deadLine;
    private Date givenDate;
    private Date subDateTime;
    private float oralMark;
    private float totalMark;
    private Course course;



public Assignment(String title, String description, String givenDate, String deadLine, String subDateTime, float oralMark, float totalMark) throws ParseException {

        this.title = title;
        this.description = description;
        this.deadLine = DateUtilities.convertedDateFromString(deadLine);
        this.givenDate = DateUtilities.convertedDateFromString(givenDate);
        this.subDateTime=DateUtilities.convertedDateFromString(subDateTime);
        this.oralMark = oralMark;
        this.totalMark = totalMark;
        
   

    }

    public Date getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(Date subDateTime) {
        this.subDateTime = subDateTime;
    }

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLineFromString(String deadLine) throws ParseException {
        this.deadLine = DateUtilities.convertedDateFromString(deadLine);
    }

    public void setDeadLineFromDate(Date deadLine) {
        this.deadLine = deadLine;

    }

    public float getOralMark() {
        return oralMark;
    }

    public void setOralMark(float oralMark) {
        this.oralMark = oralMark;
    }

    public float getTotalMark() {
        return totalMark;

    }

    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }

   


    
}
