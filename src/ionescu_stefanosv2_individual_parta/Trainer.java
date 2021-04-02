package ionescu_stefanosv2_individual_parta;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {

    private String firstName;
    private String lastName;
    private String subject;
    private ArrayList<Course> courses;

    public Trainer() {
    }

    public Trainer(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.courses = new ArrayList<>();
    }

    public ArrayList<Course> getCourse() {
        return courses;
    }

    public void setCourse(ArrayList<Course> courses) {
        this.courses = courses;
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

    public String getSubject() {
        return subject;

    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printAllTrainers(ArrayList<Trainer> trainers) {

        for (Trainer trainer : trainers) {
            System.out.println("Name and Lastname of Trainer is: "
                    + trainer.getFirstName() + " " + trainer.getLastName()
                    + ".The Trainers Subject is: " + trainer.getSubject()
                    + " The Trainers Courses are: " + courses);

        }

    }

    public void addCourse(Course course) {
        courses.add(course);

    }

}
