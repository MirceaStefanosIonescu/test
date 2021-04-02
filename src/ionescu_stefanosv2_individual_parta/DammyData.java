package ionescu_stefanosv2_individual_parta;

import java.text.ParseException;
import java.util.ArrayList;

public class DammyData {

    static ArrayList<Course> coursesAll = new ArrayList<>();
    static ArrayList<Student> studentsAll = new ArrayList<>();
    static ArrayList<Assignment> assigmentsAll = new ArrayList<>();
    static ArrayList<Trainer> trainersAll = new ArrayList<>();
    static ArrayList<CourseInfomation> courseInfoList = new ArrayList<>();

    public static ArrayList<Course> createArrayListCourseSynth() throws ParseException {

        Course course0 = new Course("Course1", "Stream1", "FullTime", "01/03/2021", "01/07/2021");
        Course course1 = new Course("Course2", "Stream1", "ParTime", "01/03/2021", "01/09/2021");
        Course course2 = new Course("Course3", "Stream2", "FullTime", "01/03/2021", "01/07/2021");
        Course course3 = new Course("Course4", "Stream2", "PartTime", "01/03/2021", "01/09/2021");
        Course course4 = new Course("Course5", "Stream3", "FullTime", "01/03/2021", "01/07/2021");
        Course course5 = new Course("Course6", "Stream3", "PartTime", "01/03/2021", "01/09/2021");

        coursesAll.add(course0);
        coursesAll.add(course1);
        coursesAll.add(course2);
        coursesAll.add(course3);
        coursesAll.add(course4);
        coursesAll.add(course5);

        return coursesAll;
    }

    public static ArrayList<Assignment> createListAssigmentsAllSynth() throws ParseException {

        Assignment assigment0 = new Assignment("title1", "description1", "01/03/2021", "08/03/2021", "07/03/2021", 32, 78);
        assigment0.setCourse(coursesAll.get(0));
        Assignment assigment1 = new Assignment("title2", "description2", "14/03/2021", "21/03/2021", "20/03/2021", 40, 80);
        assigment1.setCourse(coursesAll.get(1));
        Assignment assigment2 = new Assignment("title3", "description3", "22/03/2021", "31/03/2021", "30/03/2021", 33, 38);
        assigment2.setCourse(coursesAll.get(2));
        Assignment assigment3 = new Assignment("title4", "description4", "01/04/2021", "14/04/2021", "13/04/2021", 22, 58);
        assigment3.setCourse(coursesAll.get(3));
        Assignment assigment4 = new Assignment("title5", "description5", "15/04/2021", "24/04/2021", "23/04/2021", 52, 98);
        assigment4.setCourse(coursesAll.get(4));
        Assignment assigment5 = new Assignment("title6", "description6", "25/04/2021", "06/05/2021", "06/05/2021", 30, 88);
        assigment5.setCourse(coursesAll.get(5));
        Assignment assigment6 = new Assignment("title7", "description7", "20/05/2021", "04/06/2021", "04/06/2021", 33, 67);
        assigment6.setCourse(coursesAll.get(0));
        Assignment assigment7 = new Assignment("title1", "description1", "01/03/2021", "08/03/2021", "07/03/2021", 22, 75);
        assigment7.setCourse(coursesAll.get(4));
        Assignment assigment8 = new Assignment("title2", "description2", "14/03/2021", "21/03/2021", "20/03/2021", 52, 89);
        assigment8.setCourse(coursesAll.get(3));
        Assignment assigment9 = new Assignment("title3", "description3", "22/03/2021", "31/03/2021", "30/03/2021", 40, 80);
        assigment9.setCourse(coursesAll.get(1));
        Assignment assigment10 = new Assignment("title4", "description4", "01/04/2021", "14/04/2021", "13/04/2021", 35, 90);
        assigment10.setCourse(coursesAll.get(2));
        Assignment assigment11 = new Assignment("title5", "description5", "15/04/2021", "24/04/2021", "23/04/2021", 23, 54);
        assigment11.setCourse(coursesAll.get(1));
        Assignment assigment12 = new Assignment("title6", "description6", "25/04/2021", "06/05/2021", "05/05/2021", 31, 48);
        assigment12.setCourse(coursesAll.get(3));

        assigmentsAll.add(assigment0);
        assigmentsAll.add(assigment1);
        assigmentsAll.add(assigment2);
        assigmentsAll.add(assigment3);
        assigmentsAll.add(assigment4);
        assigmentsAll.add(assigment5);
        assigmentsAll.add(assigment6);
        assigmentsAll.add(assigment7);
        assigmentsAll.add(assigment8);
        assigmentsAll.add(assigment9);
        assigmentsAll.add(assigment10);
        assigmentsAll.add(assigment11);
        assigmentsAll.add(assigment12);

        return assigmentsAll;
    }

    public static ArrayList<Student> createListStudentsAllWithcCouresAndAssigmentsSynth() throws ParseException {
        Student student0 = new Student("Mitsos", "Karabias", "05/05/1994", 200);
        student0.addCourse(coursesAll.get(0));
        student0.addCourse(coursesAll.get(1));
        student0.addAssignment(assigmentsAll.get(0));
        student0.addAssignment(assigmentsAll.get(2));

        Student student1 = new Student("Kitsos", "Karas", "04/06/1996", 200);
        student1.addCourse(coursesAll.get(2));
        student1.addCourse(coursesAll.get(3));
        student1.addAssignment(assigmentsAll.get(2));
        student1.addAssignment(assigmentsAll.get(3));

        Student student2 = new Student("Mitsos", "Fokas", "05/06/1996", 400);
        student2.addCourse(coursesAll.get(2));
        student2.addAssignment(assigmentsAll.get(1));
        student2.addAssignment(assigmentsAll.get(4));

        studentsAll.add(student0);
        studentsAll.add(student1);
        studentsAll.add(student2);

        return studentsAll;
    }

    public static ArrayList<Trainer> createListTrainersALLWithCouresSynth() {

        Trainer trainer0 = new Trainer("Thodoros", "Katsabos", "SubjectA");
        Trainer trainer1 = new Trainer("George", "Korkitis", "SubjectB");
        Trainer trainer2 = new Trainer("Makis", "Boridis", "SubjectC");
        Trainer trainer3 = new Trainer("Giota", "Malama", "SubjectO");
        Trainer trainer4 = new Trainer("Fotini", "Kota", "SubjectP");
        Trainer trainer5 = new Trainer("Sokratis", "Vovos", "SubjectD");
        Trainer trainer6 = new Trainer("Xaralampos", "Volvos", "SubjectF");
        Trainer trainer7 = new Trainer("Katerina", "Maragkou", "SubjectB");
        Trainer trainer8 = new Trainer("Thodoros", "Katsabos", "SubjectA");

        trainersAll.add(trainer0);
        trainersAll.add(trainer1);
        trainersAll.add(trainer2);
        trainersAll.add(trainer3);
        trainersAll.add(trainer4);
        trainersAll.add(trainer5);
        trainersAll.add(trainer6);
        trainersAll.add(trainer7);
        trainersAll.add(trainer8);

        trainer1.addCourse(coursesAll.get(0));
        trainer1.addCourse(coursesAll.get(2));
        trainer2.addCourse(coursesAll.get(1));
        trainer2.addCourse(coursesAll.get(3));
        trainer0.addCourse(coursesAll.get(0));
        trainer0.addCourse(coursesAll.get(5));

        return trainersAll;
    }

    
    
    
}
