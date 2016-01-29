package q4;
import q3.Student;
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;


/**
 * <p>The Course class holds a student's course information.</p>
 * @author Justin Chun
 * @version 1.0
 */

public class Course {
    /**
     * <p>to represent the number 5.</p>
     */
    private static final int FIVE = 5;
    /**
     * <p>private name to String.</p>
     */
    private String name;
    /**
     * <p>students to List.</p>
     */
    private List<Student> students;
    /**
     * <p>private average set to double.</p>
     */
    private double average;
   
    /**
     * <p>Constructor for Course to contain name.</p>
     * @param name set to this.name.
     */
    public Course(String name) {
        this.name = name;
        
        students = new ArrayList<Student>();
    }
    
    /**
     * <p>Method to add a student to Student.</p>
     * @param student to be added into students array
     */
    public void addStudent(Student student) {
        students.add(student);
    }
    /**
     * <p>Method to calculate total average of a course.</p>
     * @param x as a holder for student1 average
     * @param y as a holder for student2 average
     * @param z as a holder for student3 average
     * @param u as a holder for student4 average
     * @param a as a holder for student5 average
     * @return average
     */
    public double average(double x, double y, double z,
            double u, double a) {
        average = (x + y + z + u + a) / FIVE;
        return average;
    }
    /**
     * <p>Method toString to return the total average.</p>
     * @return result
     */
    public String toString() {
        DecimalFormat dfmt = new DecimalFormat(".##");
        String result;
        result = "The overall class average is: " + dfmt.format(average);
        return result;
    }
    /**
     * <p>Method roll to do a roll call of the student with 
     * additional information like address and test scores.</p>
     */
    public void roll() {
        System.out.println("Course Name: " + name);
        System.out.println("Students: " + "\t");
       
        for (Student student : students) {
            System.out.println("" + student.toString());
        }
    }
    
}
