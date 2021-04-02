
package ionescu_stefanosv2_individual_parta;

import static ionescu_stefanosv2_individual_parta.Main.assigmentsAll;
import static ionescu_stefanosv2_individual_parta.Main.coursesAll;


public class FIx {
    
    
 String userCourseTitle = "";
                            while (true) {

                                System.out.println("Please give Course Title or input end to end the selection.");
                                userCourseTitle = input.nextLine();
                                boolean flag = false;

                                if (userCourseTitle.equals("end")) {

                                    break;
                                }

                                for (Course courseChoise : coursesAll) {

                                    if (courseChoise.getTitle().equals(userCourseTitle)) {
                                        System.out.println("Found" + courseChoise.getTitle());
                                        int choiseContiniue;
                                        do {
                                            System.out.println("Please give Assigments Title to impliment to Course.");
                                            String userAssigmentsTitle = input.nextLine();

                                            for (Assignment assgimentChoise : assigmentsAll) {
                                                if (userAssigmentsTitle.equals(assgimentChoise.getTitle())) {

                                                    assgimentChoise.setCourse(courseChoise);
                                                    flag = true;
                                                    break;
                                                }
                                                System.out.println("For the course with Title: " + coursesAll.get(userChoise).getTitle());
                                                System.out.println("The Course Assigments are: " + assigmentsAll.get(userChoise).getTitle());
                                            }
                                            if (flag) {
                                                break;
                                            }
                                            System.out.println("Would you like to add an Other Assignment to the Course "
                                                    + "\n1" + " to continiue"
                                                    + "\n2" + " to stop.");
                                            choiseContiniue = input.nextInt();

                                        } while (choiseContiniue == 2);

                                    }

                                }
                                if (!flag) {
                                    System.out.println("Something went Wrong Title not Found");
                                }

                            }
    
    
    
    
    Student student0 = new Student("Mitsos", "Karabias", "05/05/1994", 200);
        student0.addCourse(coursesAll.get(0));
        student0.addCourse(coursesAll.get(1));
    
    Student student1 = new Student("Kitsos", "Karas", "04/06/1996", 200);
        student1.addCourse(coursesAll.get(2));
        student1.addCourse(coursesAll.get(3));
    
        Student student2 = new Student("Mitsos", "Fokas", "05/06/1996", 400);
        student2.addCourse(coursesAll.get(2));





public static void printAddAssigmentsToStudentsManual(){
    
    String userAssignmentChoice2 = "";

                            while (true) {

                                System.out.println("Please give  Assignment Tile or input end to end the selection. ");
                                userAssignmentChoice2 = input.nextLine();
                                boolean flag3 = false;

                                if (userAssignmentChoice2.equals("end")) {
                                    break;
                                }

                                for (Assignment assignmentChoice2 : assigmentsAll) {

                                    if (userAssignmentChoice2.equals(assignmentChoice2.getTitle())) {

                                        System.out.println("Found: " + assignmentChoice2.getTitle());
                                        int choiceContinue3;
                                        do {
                                            System.out.println("Please give Student Last Name(ID) in order to add Assignments.");
                                            String userStudentChoice = input.nextLine();

                                            for (Student studentChoice2 : studentsAll) {

                                                if (userStudentChoice.equals(studentChoice2.getLastName())) {
                                                    studentChoice2.addAssignment(assignmentChoice2);

                                                    flag3 = true;
                                                    break;
                                                }
                                                System.out.println("For the Student With First&Last Name: "
                                                        + studentChoice2.getFirstName() + " " + studentChoice2.getLastName()
                                                        + "\nThe Assignments are: " + assignmentChoice2.getTitle()
                                                        + " " + assignmentChoice2.getDescription());
                                            }
                                            if (flag3) {
                                                break;
                                            }
                                            System.out.println("Would you like to add an Other Assignment to the Student?"
                                                    + "\n1" + "to continiue"
                                                    + "\n2" + "to stop.");
                                            choiceContinue3 = input.nextInt();

                                        } while (choiceContinue3 == 2);

                                    }

                                }
                                if (!flag3) {
                                    System.out.println("Something went Wrong Assigment Tile not Found or Student Last Name not Found");

                                }
                            }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
