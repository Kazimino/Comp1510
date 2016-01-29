package q3;

/**
 * <p>A driver class to display a student's information including:.</p>
 *<ul>
 *<li>First and Last name.</li>
 *<li>Home address.</li>
 *<li>School address.</li>
 *<li>three sets of test scores.<li>
 *<li>the average between the three tests.</li>
 *</ul>
 * @author Justin Chun
 * @version 1.0
 */
public class TestStudent {
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
        
        Address school = new Address("123 Fake Street", "de Dust",
                "BC", "A9A 4M8");

        Address home1 = new Address("123 Baker Drive", "Crushem Alley",
                "AB", "B1B 8N4");


        Student student1 = new Student("Jimothy", "Holmes", home1,
                school, testScore1,  testScore1,  testScore1);
        student1.setTestScore(one, testScore1);
        student1.setTestScore(two, testScore5);
        student1.setTestScore(three, testScore4);

        Address home2 = new Address("123 Main Street", "BCIT street", "BC",
                "C2C 7V4");

        Student student2 = new Student("Jules", "Vincent", home2,
                school,  testScore1,  testScore1,  testScore1);
        student2.setTestScore(one, testScore2);
        student2.setTestScore(two, testScore3);
        student2.setTestScore(three, testScore2);

        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
    }
}

