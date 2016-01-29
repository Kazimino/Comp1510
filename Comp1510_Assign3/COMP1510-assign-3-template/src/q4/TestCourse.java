package q4;
import q3.Student;

import java.text.DecimalFormat;

import q3.Address;

/**
 * <p>Driver class for Course.java to add 5 students and do a
 * roll call.</p>
 *
 * @author Justin Chun
 * @version 1.0
 */
public class TestCourse {
    /**
     * <p>The main method to add and set new test scores for students.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        final int testScore1 = 40;
        final int testScore2 = 85;
        final int testScore3 = 90;
        final int testScore4 = 65;
        final int testScore5 = 50;
        final int one = 1;
        final int two = 2;
        final int three = 3;
        DecimalFormat dfmt = new DecimalFormat(".##");
        
        Course course = new Course("COMP 1510");
        Address school = new Address("3700 Willingdon Avenue", "Burnaby", 
                "BC", "V5G3H2");
        Address home1 = new Address("123 Baker Drive", "Crushem Alley",
                "AB", "B1B 8N4");
        Address home2 = new Address("123 Main Street", "BCIT street", "BC",
                "C2C 7V4");
        Address home3 = new Address("123 Fake Street", "Vancouver", 
                "BC", "V4M4G3");
        Address home4 = new Address("123 Bacon Drive", "Burnaby", 
                "BC", "V3H3M8");
        Address home5 = new Address("151 Chicken Place", "Surrey", 
                "BC", "7D8Q8W");

        Student justin = new Student("Justin", "Smith", home1, 
                school, testScore2,  testScore2,  testScore2);
        Student chris = new Student("Chris", "Jones", home2, 
                school, testScore2,  testScore2,  testScore2);
        Student tom = new Student("Tom", "Smith", home3, 
                school, testScore2,  testScore2,  testScore2);
        Student harry = new Student("Harry", "Potter", home4, 
                school, testScore2,  testScore2,  testScore2);
        Student bill = new Student("Bill", "Gates", home5, 
                school, testScore2,  testScore2,  testScore2);

        course.addStudent(justin);
        course.addStudent(chris);
        course.addStudent(tom);
        course.addStudent(harry);
        course.addStudent(bill);

        justin.setTestScore(one, testScore1);
        justin.setTestScore(two, testScore2);
        justin.setTestScore(three, testScore3);

        chris.setTestScore(one, testScore3);
        chris.setTestScore(two, testScore4);
        chris.setTestScore(three, testScore3);

        tom.setTestScore(one, testScore3);
        tom.setTestScore(two, testScore1);
        tom.setTestScore(three, testScore5);

        harry.setTestScore(one, testScore5);
        harry.setTestScore(two, testScore1);
        harry.setTestScore(three, testScore2);

        bill.setTestScore(one, testScore3);
        bill.setTestScore(two, testScore3);
        bill.setTestScore(three, testScore3);
        
        double x = justin.average();
        double y = chris.average();
        double z = tom.average();
        double u = harry.average();
        double a = bill.average();
        System.out.println(dfmt.format(course.average(justin.average(), 
                chris.average(), tom.average(), harry.average(), 
                bill.average())));

        course.roll();

        System.out.println(course);
    }

}

