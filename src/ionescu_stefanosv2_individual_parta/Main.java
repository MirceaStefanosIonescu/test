package ionescu_stefanosv2_individual_parta;

import java.text.ParseException;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static ArrayList<Course> coursesAll = new ArrayList<>();
    static ArrayList<Student> studentsAll = new ArrayList<>();
    static ArrayList<Assignment> assigmentsAll = new ArrayList<>();
    static ArrayList<Trainer> trainersAll = new ArrayList<>();
    static ArrayList<CourseInfomation> courseInfoList = new ArrayList<>();

    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        int userChoice;
        int userChoice2;

        userChoice = choiseMenu1();

        switch (userChoice) {

            case 1:

                do {

                    userChoice2 = menu2();

                    switch (userChoice2) {

                        case 1:
                            boolean flagStp = true;
                            do {
                                Student student = inputNewStudent();
                                studentsAll.add(student);
                                printAllStudentsManual();
                                System.out.println("Would you like to Add an Other Student?"
                                        + "\n1 for Yes."
                                        + "\n2 for No.");
                                int userStudetPrintChoice = input.nextInt();
                                if (userStudetPrintChoice == 2) {
                                    flagStp = false;
                                }
                            } while (flagStp == true);

                            break;

                        case 2:

                            boolean flagTtp = true;
                            do {
                                Trainer trainer = inputNewTrainer();
                                trainersAll.add(trainer);
                                printAllTrainersManual();
                                System.out.println("Would you like to Add an Other Trainer?"
                                        + "\n1 for Yes."
                                        + "\n2 for No.");
                                int userTrainerPrintChoice = input.nextInt();
                                if (userTrainerPrintChoice == 2) {
                                    flagTtp = false;
                                }
                            } while (flagTtp == true);
                            break;

                        case 3:
                            boolean flagAtp = true;
                            do {
                                Assignment assignment = inputNewAssigment();
                                assigmentsAll.add(assignment);
                                printAllAssignmentManual();
                                System.out.println("Would you like to Add an Other Assignment?"
                                        + "\n1 for Yes."
                                        + "\n2 for No.");
                                int userAssignmentPrintChoice = input.nextInt();
                                if (userAssignmentPrintChoice == 2) {
                                    flagAtp = false;
                                }

                            } while (flagAtp == true);
                            break;

                        case 4:

                            boolean flagCtp = true;

                            do {

                                Course course = inputNewCourse();
                                coursesAll.add(course);
                                printAllCoursesManual();
                                System.out.println("Would you like to Add an Other Course?"
                                        + "\n1 for Yes."
                                        + "\n2 for No.");
                                int userCoursePrintChoice = input.nextInt();
                                if (userCoursePrintChoice == 2) {
                                    flagCtp = false;
                                }

                            } while (flagCtp == false);
                            break;

                        case 5:

                            studentPerCourseInput();
                            break;
                        case 6:
                            //Adding  Courses to trainer.
                            printAddCouresToTrainerManual();

                            break;
                        case 7:
                            //Adding Courses to Student
                            printAddCoursesToStudentManual();

                            break;

                        case 8:
                            //Adding Assignments to Students.
                            printAddAssigmentsToStudentsManual();

                            break;

                        case 9:
                            printStudentWithMoreClasses();
                            break;

                        case 10:
                            printStudentsAssigmentsWithInDayOfWeek();
                            break;

                    }

                } while (userChoice2 != 0);
                break;

            case 2:

                addDummyData();
                createCourseInfomationListSynth();
                //dummy
                printAllStudentsSynth(studentsAll);
                System.out.println("Part1 Complete");
                System.out.println();

                printAllTrainersSynth(trainersAll);
                System.out.println("Part2 Complete");
                System.out.println();

                printAllAssigmentsSyth(assigmentsAll);
                System.out.println("Part3 Complete");
                System.out.println();

                printAllCoursesSynth(coursesAll);
                System.out.println("Part4 Complete");
                System.out.println();

                printStudentPerCourse();
                System.out.println("Part5 Complete");
                System.out.println();

                printTrainersPerCourse(courseInfoList);
                System.out.println("Part6 Complete");
                System.out.println();

                printAssigmentsPerCourse(courseInfoList);
                System.out.println("Part7 Complete");
                System.out.println();

                printAssignmentsPerStudentSynth();
                System.out.println("Part8 Complete");
                System.out.println();

                printStudentWithMoreClasseSynt();
                System.out.println("Part9 Complete");
                System.out.println();

                printStudentsAssigmentsWithInDayOfWeekSynth(courseInfoList);
                System.out.println("Part10 Complete");
                System.out.println();
                break;

            case 3:
                System.out.println("Have a nice day goodBye!");
                break;
            default:
                System.out.println("Lalala");

        }

    }

    public static void printStudentWithMoreClasses() {

        for (Student studentTest : studentsAll) {
            for (Course studentCourse : studentTest.getCourse()) {
                if (studentTest.getCourse().size() != 1) {
                    System.out.println("The Student with First&Last Name: " + studentTest.getFirstName()
                            + " " + studentTest.getLastName() + "\nHas Course With Title And Stream: "
                            + studentCourse.getTitle() + " " + studentCourse.getStream());

                } else {
                    System.out.println("None Found");
                }
            }

        }

    }

    public static void printStudentWithMoreClasseSynt() {

        for (Student studentsRun : studentsAll) {
            for (Course studentsCourses : studentsRun.getCourse()) {

                if (studentsRun.getCourse().size() != 1) {

                    System.out.println("The Student with First&Last Name: " + studentsRun.getFirstName()
                            + " " + studentsRun.getLastName() + " Birthday: "
                            + DateUtilities.convertDateToString(studentsRun.getDateOfBirth())
                            + " With Tuition fees: " + studentsRun.getTuitionFees()
                            + "\nHas Course With Title And Stream: "
                            + studentsCourses.getTitle() + " " + studentsCourses.getStream());

                    System.out.println();
                }

            }

        }
    }

    public static int choiseMenu1() {

        Scanner input = new Scanner(System.in);

        boolean flag1 = false;
        int userChoise = 0;

        while (userChoise < 1 || userChoise > 3) {

            System.out.println("Greatings would  you like to input date or use Synthetic Data?:"
                    + "\n" + " 1 for manual input."
                    + "\n" + " 2 for use of Synthetic Data."
                    + "\n" + " 3 to end the Programm.");

            try {
                userChoise = input.nextInt();

            } catch (Exception n1) {
                String blackHole = input.nextLine();
                System.out.println("Please give an input of integer number from (1,2,3) ");

                System.out.println(blackHole + " Is the error please give Correct input");
            }

        }
        return userChoise;
    }

    public static void printAllStudentsSynth(ArrayList<Student> students) {

        for (Student student : students) {
            System.out.println("The Name and Lastname of the Student is: "
                    + student.getFirstName() + " "
                    + student.getLastName() + " "
                    + "\nBirthday: " + DateUtilities.convertDateToString(student.getDateOfBirth())
                    + " Tuition fees are: " + student.getTuitionFees());

        }
    }

    public static void printAllTrainersSynth(ArrayList<Trainer> trainers) {

        for (Trainer trainer : trainers) {
            System.out.println("The Name and Lastname of the Trainer: "
                    + trainer.getFirstName() + " " + trainer.getLastName()
                    + "\nThe Trainers subjects are: " + trainer.getSubject());

        }

    }

    public static void printAllAssigmentsSyth(ArrayList<Assignment> assignments) {

        for (Assignment assigment : assignments) {
            System.out.println("The name of Assignment: " + assigment.getTitle() + " "
                    + "The Description is: " + assigment.getDescription()
                    + "\nThe given Date of the Assigment is: " + DateUtilities.convertDateToString(assigment.getGivenDate())
                    + " " + "The Dealine Date is: " + DateUtilities.convertDateToString(assigment.getDeadLine()) + " "
                    + "\nThe Oral Mark is: " + assigment.getOralMark() + " "
                    + "The Total Mark is: " + assigment.getTotalMark());
            System.out.println();
        }

    }

    public static void printAllCoursesSynth(ArrayList<Course> courses) {

        for (Course course : courses) {
            System.out.println("The Title of the Course is: " + course.getTitle() + " "
                    + "The Stream of the Course is: " + course.getStream() + "\n"
                    + "The Starting Date is " + DateUtilities.convertDateToString(course.getStartasDate())
                    + " " + "The End Date is: " + DateUtilities.convertDateToString(course.getEndDate()));

        }
    }

    public static void printTrainersPerCourse(ArrayList<CourseInfomation> courseInfoList) {

        for (CourseInfomation course : courseInfoList) {
            System.out.println();
            System.out.println("The Course with Name, Stream and Type: " + course.getCourse().getTitle()
                    + " " + course.getCourse().getStream()
                    + " " + course.getCourse().getType() + "\nWith Start And End Date: "
                    + DateUtilities.convertDateToString(course.getCourse().getStartasDate()) + " "
                    + DateUtilities.convertDateToString(course.getCourse().getEndDate()));
            for (Trainer trainer : course.getTrainer()) {
                System.out.println("Has a Trainer with Fist, Last Name and Subject :" + trainer.getFirstName() + " " + trainer.getLastName()
                        + " " + trainer.getSubject());

            }

        }
    }

    public static void printAssigmentsPerCourse(ArrayList<CourseInfomation> courseInfoList) {

        for (CourseInfomation course : courseInfoList) {
            System.out.println();
            System.out.println("The Course with Name, Stream and Type: " + course.getCourse().getTitle()
                    + " " + course.getCourse().getStream()
                    + " " + course.getCourse().getType() + "\nWith Start And End Date: "
                    + DateUtilities.convertDateToString(course.getCourse().getStartasDate()) + " "
                    + DateUtilities.convertDateToString(course.getCourse().getEndDate()));
            for (Assignment assignment : course.getAssignment()) {
                System.out.println("Has an assignment with Title,Descrtiption: " + assignment.getTitle()
                        + " " + assignment.getDescription()
                        + "\nWith Given and End Date: " + DateUtilities.convertDateToString(assignment.getGivenDate())
                        + " " + DateUtilities.convertDateToString(assignment.getDeadLine())
                        + "\nAnd Oral and Total Mark: " + assignment.getOralMark() + " " + assignment.getTotalMark());

            }
        }
    }

    public static void printAssignmentsPerStudentSynth() {

        for (Student student : studentsAll) {
            System.out.println("The Student with First&Last Name: " + student.getFirstName() + " " + student.getLastName()
                    + "\nWith date of birth and tuitions fees: " + DateUtilities.convertDateToString(student.getDateOfBirth()) + " " + student.getTuitionFees());

            for (Assignment assigment : student.getAssignments()) {
                System.out.println("The Assigment with Tile & Description: "
                        + assigment.getTitle() + " " + assigment.getDescription()
                        + "\nWith given date,deadline and submission date: "
                        + DateUtilities.convertDateToString(assigment.getGivenDate()) + " " + DateUtilities.convertDateToString(assigment.getDeadLine()) + " "
                        + DateUtilities.convertDateToString(assigment.getSubDateTime()));
            }
        }
    }

    public static void printStudentPerCourse() {

        for (Course course : coursesAll) {
            System.out.println("For the Course with Title: " + course.getTitle());

            for (Student student : studentsAll) {

                for (Course courseStudent : student.getCourse()) {
                    if (courseStudent.getTitle().equals(course.getTitle())) {
                        System.out.println("The Students are: " + student.getFirstName() + " " + student.getLastName());

                    }
                }

            }

        }
    }

    public static void addDummyData() {

        try {

            coursesAll = DammyData.createArrayListCourseSynth();
            assigmentsAll = DammyData.createListAssigmentsAllSynth();
            studentsAll = DammyData.createListStudentsAllWithcCouresAndAssigmentsSynth();
            trainersAll = DammyData.createListTrainersALLWithCouresSynth();

        } catch (ParseException ex) {
            System.out.println("Wrond Input of Date");

        }

    }

    public static int menu2() {

        Scanner input = new Scanner(System.in);

        boolean flag1 = false;
        int userChoise2 = -1;

        while (userChoise2 < 0 || userChoise2 > 10) {

            System.out.println("Greatings would  you like to input Data or use Synthetic Data?:"
                    + "\n" + " 1 for Student Creation."
                    + "\n" + " 2 for Trainer Creation."
                    + "\n" + " 3 for Assigments Creation."
                    + "\n" + " 4 for Courses Creation."
                    + "\n" + " 5 for Adding Course to Assigments."
                    + "\n" + " 6 for Adding Courses to Trainers."
                    + "\n" + " 7 for Adding Courses to Student. "
                    + "\n" + " 8 for Adding Assignments to Student."
                    + "\n" + " 9 for Students with more than one Assigment."
                    + "\n" + " 10 to Check Assignments for submission on requested Date."
                    + "\n" + " 0 for Exit.");
            try {
                userChoise2 = input.nextInt();

            } catch (Exception n1) {
                String blackHole = input.nextLine();
                System.out.println("Please give an input of integer number from (0,1,2,3,4,5,6,7,8,9,10) ");

                System.out.println(blackHole + " Is the error please give Correct input");
            }

        }
        return userChoise2;

    }

    public static Assignment inputNewAssigment() throws ParseException {

        Scanner input = new Scanner(System.in);

        System.out.println("Please give Assigment's title: ");
        String assignmentTitle = input.nextLine();

        System.out.println("Please give Assigment's description");
        String assignmentDescription = input.nextLine();

        System.out.println("Please give Assigment's givenDate in the following format (dd/MM/YYYY)");

        String assignmentGivenDate = "00/00/0000";

        boolean flagKoukou = true;
        while (flagKoukou == true) {
            flagKoukou = false;
            try {

                assignmentGivenDate = input.nextLine();

            } catch (Exception dateInput) {

                flagKoukou = true;

                System.out.println("Please Try again to give Correct Date Format (dd/MM/YYYY) for example 31/03/2021");

            }

        }

        String assignmentDeadLine = "00/00/0000";
        System.out.println("Please give Assigment's deadLine in the following format (dd/MM/YYYY)");
        boolean flagKoukou1 = true;
        while (flagKoukou1 == true) {
            flagKoukou1 = false;
            try {
                assignmentDeadLine = input.nextLine();

            } catch (Exception dateInput) {

                flagKoukou = true;

                System.out.println("Please Try again to give Correct Date Format (dd/MM/YYYY) for example 31/03/2021");
            }
        }
        String assignmentSubDateTime = "00/00/0000";

        System.out.println("Please give Assigment's subDateTime in the following format (dd/MM/YYYY)");
        boolean flagKoukou2 = true;
        while (flagKoukou2 == true) {
            flagKoukou2 = false;
            try {
                assignmentSubDateTime = input.nextLine();
            } catch (Exception dateInput) {

                flagKoukou2 = true;

                System.out.println("Please Try again to give Correct Date Format (dd/MM/YYYY) for example 31/03/2021");

            }
        }

        boolean flagKoukou3 = true;
        float assignmentOralMark = -1;
        System.out.println("Please give Assigment's oralMark");
        while (assignmentOralMark < 0 && assignmentOralMark > 100) {
            try {
                assignmentOralMark = input.nextFloat();
            } catch (Exception floatInput) {
                flagKoukou3 = true;
                System.out.println("Please Try again to give Correct Mark from 0 to 100.");
            }
        }
        boolean flagKoukou4 = true;
        float assignmentTotalMark = -1;
        System.out.println("Please give Assigment's totalMark");
        while (assignmentTotalMark < 0 && assignmentTotalMark > 100) {

            try {
                assignmentTotalMark = input.nextFloat();

            } catch (Exception floatInput) {
                flagKoukou4 = true;
                System.out.println("Please Try again to give Correct Mark from 0 to 100.");
            }
        }
        Assignment assignment = new Assignment(assignmentTitle, assignmentDescription,
                assignmentDeadLine, assignmentGivenDate, assignmentSubDateTime, assignmentOralMark, assignmentTotalMark);

        return assignment;
    }

    public static Student inputNewStudent() throws ParseException {

        Scanner input = new Scanner(System.in);

        System.out.println("Please give the new Student's information first name");
        String studentFistName = input.nextLine();

        System.out.println("Pleas give the new Student's information last name");
        String studentLastName = input.nextLine();

        System.out.println("Please give the new Student's information date of birth in the following format (dd/MM/YYYY)");
        String studentDateOfBirth = input.nextLine();

        System.out.println("Please give the new Student's tuitionFees");
        int studentTuitionFees = input.nextInt();

        //store the info of the student  to the studentsAll list?
        Student student = new Student(studentFistName, studentLastName, (studentDateOfBirth),
                studentTuitionFees);

        return student;

        //Created and Stored a Student
    }

    public static Trainer inputNewTrainer() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please give Trainer's first");
        String trainerFirstName = input.nextLine();

        System.out.println("Please give Trainer's last name");
        String trainerLastName = input.nextLine();

        System.out.println("Please give Trainer's Subject");
        String trainerSubject = input.nextLine();

        Trainer trainer = new Trainer(trainerFirstName, trainerLastName,
                trainerSubject);

        return trainer;
    }

    public static Course inputNewCourse() throws ParseException {

        Scanner input = new Scanner(System.in);

        System.out.println("Please give Course Title");
        String courseTitle = input.nextLine();

        System.out.println("Please give Course Stream");
        String courseStream = input.nextLine();

        System.out.println("Please give Course Type");
        String courseType = input.nextLine();

        System.out.println("Please give Course start_date in the following format (dd/MM/YYYY)");
        String courseStart_Date = input.nextLine();
        System.out.println("Please give Course end_date in the following format (dd/MM/YYYY)");
        String courseEnd_Date = input.nextLine();

        Course course = new Course(courseTitle, courseStream, courseType,
                courseStart_Date, courseEnd_Date);

        return course;

    }

    public static void createCourseInfomationListSynth() throws ParseException {

        ArrayList<Student> student01 = new ArrayList<>();

        student01.add(studentsAll.get(0));
        student01.add(studentsAll.get(1));

        ArrayList<Student> student02 = new ArrayList<>();
        student02.add(studentsAll.get(2));
        student02.add(studentsAll.get(1));

        ArrayList<Trainer> trainers01 = new ArrayList<>();
        trainers01.add(trainersAll.get(0));
        trainers01.add(trainersAll.get(1));
        trainers01.add(trainersAll.get(2));

        ArrayList<Trainer> trainers02 = new ArrayList<>();
        trainers02.add(trainersAll.get(3));
        trainers02.add(trainersAll.get(2));
        trainers02.add(trainersAll.get(1));

        ArrayList<Assignment> assigmentsSt0 = new ArrayList<>();
        assigmentsSt0.add(assigmentsAll.get(0));
        assigmentsSt0.add(assigmentsAll.get(1));

        ArrayList<Assignment> assigmentsSt1 = new ArrayList<>();
        assigmentsSt1.add(assigmentsAll.get(3));
        assigmentsSt1.add(assigmentsAll.get(4));

        Course course0 = new Course("Course1", "Stream1", "FullTime", "01/03/2021", "01/07/2021");
        Course course1 = new Course("Course2", "Stream1", "ParTime", "01/03/2021", "01/09/2021");

        CourseInfomation courseInfo0 = new CourseInfomation(course0, student01, trainers01, assigmentsSt0);
        CourseInfomation courseInfo1 = new CourseInfomation(course1, student01, trainers02, assigmentsSt1);

        courseInfoList.add(courseInfo0);
        courseInfoList.add(courseInfo1);

    }

    public static Course getCourseAfromCoursesAll(ArrayList<Course> coursesAll, String courseTitle) throws ParseException {
        Scanner input = new Scanner(System.in);
        Course courseI = new Course("null", "null", "null", "00/00/00", "00/00/00");

        for (int i = 0; i < coursesAll.size(); i++) {
            if (coursesAll.get(i).getTitle().equals(courseTitle)) {
                courseI = coursesAll.get(i);

            }
        }
        return courseI;
    }

    public static void createArrayListCourseToStudentSynth() {

        studentsAll.get(0).addCourse(coursesAll.get(0));
        studentsAll.get(0).addCourse(coursesAll.get(1));

        studentsAll.get(1).addCourse(coursesAll.get(2));

        studentsAll.get(2).addCourse(coursesAll.get(1));
        studentsAll.get(2).addCourse(coursesAll.get(2));

    }

    public static void studentPerCourseInput() {
        Scanner input = new Scanner(System.in);
        String userCourseTitle = "";

        while (true) {

            System.out.println("Please give Course Title or input end to end the selection.");
            userCourseTitle = input.nextLine();
            boolean flag = false;

            if (userCourseTitle.equals("end")) {

                break;
            }

            for (Course courseChoice : coursesAll) {

                if (courseChoice.getTitle().equals(userCourseTitle)) {
                    System.out.println("Found: " + courseChoice.getTitle());
                    int choiceContiniue;
                    do {
                        System.out.println("Please give Assigments Title to impliment to Course.");
                        String userAssigmentsTitle = input.nextLine();

                        for (Assignment assgimentChoice : assigmentsAll) {
                            if (userAssigmentsTitle.equals(assgimentChoice.getTitle())) {

                                assgimentChoice.setCourse(courseChoice);
                                flag = true;
                                break;
                            }
                            System.out.println("For the course with Title: " + courseChoice.getTitle());
                            System.out.println("The Course Assigments are: " + assgimentChoice.getTitle());
                        }
                        if (flag) {
                            break;
                        }
                        System.out.println("Would you like to add an Other Assignment to the Course? "
                                + "\n1" + " to continue."
                                + "\n2" + " to stop.");
                        choiceContiniue = input.nextInt();

                    } while (choiceContiniue == 2);

                }

            }
            if (!flag) {
                System.out.println("Something went Wrong Course Title Assignment Title of not Found");
            }

        }

    }

    public static void printAddCouresToTrainerManual() {
        Scanner input = new Scanner(System.in);
        String userCourseTitle1 = "";
        while (true) {

            System.out.println("Please give Course Title or input end to end the selection.");

            userCourseTitle1 = input.nextLine();
            boolean flag1 = false;

            if (userCourseTitle1.equals("end")) {

                break;
            }

            for (Course courseChoice1 : coursesAll) {

                if (courseChoice1.getTitle().equals(userCourseTitle1)) {
                    System.out.println("Found" + courseChoice1.getTitle());
                    int choiceContinue1;
                    do {

                        System.out.println("Please give Trainer Name (ID) to add Course.");
                        String userTrainerName = input.nextLine();

                        for (Trainer trainerChoice : trainersAll) {

                            if (userTrainerName.equals(trainerChoice.getFirstName())) {

                                trainerChoice.addCourse(courseChoice1);
                                flag1 = true;
                                break;
                            }
                            System.out.println("The Trainer with: " + trainerChoice.getFirstName()
                                    + " " + trainerChoice.getLastName()
                                    + " " + trainerChoice.getSubject()
                                    + "\nHas Course with Title and Stream: "
                                    + courseChoice1.getTitle()
                                    + courseChoice1.getStream());

                        }

                        if (flag1) {

                            break;
                        }

                        System.out.println("Would you like to add Other Course to The Trainer?"
                                + "\n1" + " to continue."
                                + "\n2" + " to stop.");
                        choiceContinue1 = input.nextInt();

                    } while (choiceContinue1 == 2);
                }
            }
            if (!flag1) {
                System.out.println("Something went Wrong Title not Found or Trainer Not Found");
            }
        }
    }

    public static void printAddCoursesToStudentManual() {
        Scanner input = new Scanner(System.in);

        String userCourseTitle2 = "";
        while (true) {

            System.out.println("Please give Course Title or input end to end the selection.");
            userCourseTitle2 = input.nextLine();
            boolean flag2 = false;

            if (userCourseTitle2.equals("end")) {

                break;
            }

            for (Course courseChoice2 : coursesAll) {

                if (userCourseTitle2.equals(courseChoice2.getTitle())) {
                    System.out.println("Found: " + courseChoice2.getTitle());
                    int choiceContinue2;

                    do {
                        System.out.println("Please give Stundent Last Name (ID) to add Course.");
                        String userStudentLastName = input.nextLine();

                        for (Student studentChoice : studentsAll) {
                            if (userStudentLastName.equals(studentChoice.getLastName())) {

                                studentChoice.addCourse(courseChoice2);
                                flag2 = true;

                                break;

                            }
                            System.out.println("For Student with First&Last Name: "
                                    + studentChoice.getFirstName()
                                    + studentChoice.getLastName()
                                    + "\nThe Courses Title and Stream are: "
                                    + courseChoice2.getTitle() + " "
                                    + courseChoice2.getStream());

                        }
                        if (flag2) {
                            break;
                        }
                        System.out.println("Would you like to Add an Other Course to the Student?"
                                + "\n1" + "to continue."
                                + "\n2" + "to Stop.");

                        choiceContinue2 = input.nextInt();

                    } while (choiceContinue2 == 2);

                }
            }
            if (!flag2) {
                System.out.println("Something went Wrong Title not Found Or Stunden not Found");
            }

        }

    }

    public static void printAddAssigmentsToStudentsManual() {
        Scanner input = new Scanner(System.in);
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

    public static void printAllStudentsManual() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to print All Student's?"
                + "\n1 For Yes"
                + "\n2 For No");
        int userChoiceForStudentPrint = input.nextInt();
        if (userChoiceForStudentPrint == 1) {
            for (Student studentIn : studentsAll) {
                System.out.println("The Name&Last Name of the Student is: "
                        + studentIn.getFirstName() + " "
                        + studentIn.getLastName() + " "
                        + "\nBirthday: " + DateUtilities.convertDateToString(studentIn.getDateOfBirth())
                        + " Tuition fees are: " + studentIn.getTuitionFees());
            }
        }

    }

    public static void printAllTrainersManual() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to print All Trainer's "
                + "\n1 For Yes"
                + "\n2 For No");
        int userChoiceForTrainerPrint = input.nextInt();
        if (userChoiceForTrainerPrint == 1) {

            for (Trainer trainerIn : trainersAll) {
                System.out.println("The Name and Lastname of the Trainer: "
                        + trainerIn.getFirstName() + " " + trainerIn.getLastName()
                        + "\nThe Trainers subjects are: " + trainerIn.getSubject());

            }
        }
    }

    public static void printAllAssignmentManual() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to print All Assignment? "
                + "\n1 For Yes"
                + "\n2 For No");
        int userChoiseForAssigmentsPrint = input.nextInt();

        if (userChoiseForAssigmentsPrint == 1) {

            for (Assignment assigmentsIn : assigmentsAll) {
                System.out.println("The name of Assignment: " + assigmentsIn.getTitle() + " "
                        + "The Description is: " + assigmentsIn.getDescription()
                        + "\nThe given Date of the Assigment is: " + DateUtilities.convertDateToString(assigmentsIn.getGivenDate())
                        + " " + "The Dealine Date is: " + DateUtilities.convertDateToString(assigmentsIn.getDeadLine()) + " "
                        + "\nThe Oral Mark is: " + assigmentsIn.getOralMark() + " "
                        + "The Total Mark is: " + assigmentsIn.getTotalMark());

            }

        }
    }

    public static void printAllCoursesManual() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to print All Courses?"
                + "\n1 For Yes"
                + "\n2 For No");
        int userChoiseforCoursePrint = input.nextInt();

        if (userChoiseforCoursePrint == 1) {

            for (Course courseIn : coursesAll) {
                System.out.println("The Title of the Course is: " + courseIn.getTitle() + " "
                        + "The Stream of the Course is: " + courseIn.getStream() + "\n"
                        + "The Starting Date is " + DateUtilities.convertDateToString(courseIn.getStartasDate())
                        + " " + "The End Date is: " + DateUtilities.convertDateToString(courseIn.getEndDate()));
            }

        }
    }

    public static void printStudentsAssigmentsWithInDayOfWeek() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give a Date to check Student assigment deadlines in the following formant dd/MM/YYYY.");
        String dateToCheck = input.nextLine();

        Date convertedDateToCheck = DateUtilities.convertedDateFromString(dateToCheck);

        LocalDate convertedLocalDateToCheck = DateUtilities.convertedLocalDateFromDateSimple(convertedDateToCheck);

        int convertedLocalDateCheckDayOfWeek = convertedLocalDateToCheck.getDayOfWeek().getValue();
        //kuriaki
        LocalDate startOfWeek = convertedLocalDateToCheck.minusDays(convertedLocalDateCheckDayOfWeek);
        //sabbato
        LocalDate endOfWeek = convertedLocalDateToCheck.plusDays(6 - convertedLocalDateCheckDayOfWeek);

        for (Student studentsIn : studentsAll) {

            for (Assignment assigmentIn : studentsIn.getAssignments()) {

                if (DateUtilities.convertedLocalDateFromDateSimple(assigmentIn.getDeadLine()).isAfter(startOfWeek)
                        && DateUtilities.convertedLocalDateFromDateSimple(assigmentIn.getDeadLine()).isBefore(endOfWeek)) {

                    System.out.println("The Student with First&Name: " + studentsIn.getFirstName() + " " + studentsIn.getLastName()
                            + "\nHas Assigment with Tilte and DeadLine: " + assigmentIn.getTitle() + " " + assigmentIn.getDeadLine());
                }
            }

        }

    }

    public static void printStudentsAssigmentsWithInDayOfWeekSynth(ArrayList courseInfoList) throws ParseException {

        Scanner input = new Scanner(System.in);
        System.out.println("The Date to check Student assigment deadlines is 31/03/2021");
        String dateToCheck = "31/03/2021";

        Date convertedDateToCheck = DateUtilities.convertedDateFromString(dateToCheck);

        LocalDate convertedLocalDateToCheck = DateUtilities.convertedLocalDateFromDateSimple(convertedDateToCheck);

        int convertedLocalDateCheckDayOfWeek = convertedLocalDateToCheck.getDayOfWeek().getValue();
        //kuriaki
        LocalDate startOfWeek = convertedLocalDateToCheck.minusDays(convertedLocalDateCheckDayOfWeek);
        //sabbato
        LocalDate endOfWeek = convertedLocalDateToCheck.plusDays(6 - convertedLocalDateCheckDayOfWeek);

        for (Student studentsIn : studentsAll) {

            for (Assignment assigmentIn : studentsIn.getAssignments()) {

                if (DateUtilities.convertedLocalDateFromDateSimple(assigmentIn.getDeadLine()).isAfter(startOfWeek)
                        && DateUtilities.convertedLocalDateFromDateSimple(assigmentIn.getDeadLine()).isBefore(endOfWeek)) {

                    System.out.println("The Student with First&Name: " + studentsIn.getFirstName() + " " + studentsIn.getLastName()
                            + "\nHas Assigment with Tilte and DeadLine: " + assigmentIn.getTitle() + " " + DateUtilities.convertDateToString(assigmentIn.getDeadLine()));
                }
            }

        }

    }
}
