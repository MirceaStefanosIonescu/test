package ionescu_stefanosv2_individual_parta;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Student {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int tuitionFees;

    private ArrayList<Course> courses;
    private ArrayList<Assignment> assignments;

    public Student(String firstName, String lastName, String dateOfBirth,
            int tuitionFees) throws ParseException {
        this.dateOfBirth = DateUtilities.convertedDateFromString(dateOfBirth);
        this.firstName = firstName;
        this.lastName = lastName;
        this.tuitionFees = tuitionFees;
        //edo desmeuo tin mnimi!
        this.courses = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    public ArrayList<Course> getCourse() {
        return courses;
    }

    public void setNumberOfCourses(ArrayList<Course> courses) {
        this.courses = this.courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        this.dateOfBirth = DateUtilities.convertedDateFromString(dateOfBirth);
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public void printAllListOfStudents(ArrayList<Student> students) {

        for (Student student : students) {
            System.out.println("Name and Lastname: " + student.getFirstName() + " "
                    + student.getLastName() + " "
                    + ".Birthday: " + student.getDateOfBirth()
                    + ".Tuition fees are: " + student.getTuitionFees());

        }

    }

    public void addCourse(Course course) {
        courses.add(course);

    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);

    }

}
