package q3;

import java.text.DecimalFormat;
/**
 * <p>A Student class to hold the values of a Student object
 * such as:. </p>
 *<ul>
 *<li>First and Last name.</li>
 *<li>Home address.</li>
 *<li>School address.</li>
 *<li>three sets of test scores.<li>
 *<li>the average between the three tests.</li>
 *</ul>
 *
 * @author Justin Chun
 * @version 1.0
 */
public class Student {
    /**
     * <p>ONE to represent number 1.</p>
     */    
    static final int ONE = 1;
    /**
     * <p>TWO to represent number 2.</p>
     */
    static final int TWO = 2;
    /**
     * <p>THREE to represent number 3.</p>
     */
    static final int THREE = 3;
    /**
     * <p>private firstName set as a String.</p>
     */
    private String firstName;
    /**
     * <p>private lastName set as a String.</p>
     */
    private String lastName;
    /**
     * <p>private homeAddress calling from class Address.</p>
     */
    private Address homeAddress;
    /**
     * <p>private schoolAddress calling from class Address.</p>
     */
    private Address schoolAddress;
    /**
     * <p>private test1 set as int.</p>
     */ //change back to private int
    private int test1;
    /**
     * <p> private test2 set as int.</p>
     */
    private int test2;
    /**
     * <p>private test3 set as int.</p>
     */
    private int test3;
    /**
     * <p>private score set as int.</p>
     */
    private int score;
    /**
     * <p>private average set as double.</p>
     */
    private double average;

    /**
     * <p>Student constructor with params set in the following order.</p>
     * @param first as firstName
     * @param last as lastName
     * @param home as homeAddress
     * @param school as schoolAddress
     * @param test1 as this.test1
     * @param test2 as this.test2
     * @param test3 as this.test3
     */
    public Student(String first, String last, Address home, Address school,
            int test1, int test2, int test3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    /**
     * <p>Student constructor to initialize test1, test2, and test3 to 0.</p>
     */
    public Student() {
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    /**
     * <p>A mutator method to set new testNum and score.</p>
     * @param testNum set to score depending on if its ONE, TWO, or THREE
     * @param testScore to set test
     */
    public void setTestScore(int testNum, int testScore) {

        if (testNum == ONE) {
            test1 = testScore;
        } else if (testNum == TWO) {
            test2 = testScore;
        } else if (testNum == THREE) {
            test3 = testScore;
        }
    }
    /**
     * <p>An accessor method to return test score.</p>
     * @param testNum set to score depending on if its ONE, TWO, or THREE
     * @return test1, test2, test3, and score
     */
    public int getTestScore(int testNum) {
        if (testNum == ONE) {
            return test1;
        } else if (testNum == TWO) {
            return test2;
        } else if (testNum == THREE) {
            return test3;
        } else {
            return score;
        }
    }
    /**
     * <p>A method to calculate the average between three test scores.</p>
     * @return average
     */
    public double average() {
        //double average = 0;
        average = (double) (getTestScore(ONE) + getTestScore(TWO) 
        + getTestScore(THREE)) / THREE; 
        return average;
    }

    /**
     * <p>A toString method to return result after formatting.</p>
     * @return result
     */
    public String toString() {
        String result;
        String pattern = "###.##";
        DecimalFormat df = new DecimalFormat(pattern);

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test Scores \n";
        result += "Test #1: " + test1 + "\n";
        result += "Test #2: " + test2 + "\n";
        result += "Test #3: " + test3 + "\n";
        result += "Test Score average: " + df.format(average()) + "\n";
        return result;
    }


}
