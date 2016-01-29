package q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Justin Chun
 * @version 1.0
 */
public class Survey {
    /**
     * <p>MAX_INCOME is set to the max income cutoff number.</p>
     */
    static final int MAX_INCOME = 58827;
    /**
     * <p>ONE_PERSON is set to the lowest income cutoff number.</p>
     */
    static final int ONE_PERSON = 22229;
    /**
     * <p>TWO_PERSON is set to the second lowest income cutoff number.</p>
     */
    static final int TWO_PERSON = 27674;
    /**
     * <p>THREE_PERSON is set to the third lowest income cutoff number.</p>
     */
    static final int THREE_PERSON = 34022;
    /**
     * <p>FOUR_PERSON is set to the fourth lowest income cutoff number.</p>
     */
    static final int FOUR_PERSON = 41307;
    /**
     * <p>FIVE_PERSON is set to the fifth lowest income cutoff number.</p>
     */
    static final int FIVE_PERSON = 46850;
    /**
     * <p>SIX_PERSON is set to the sixth lowest income cutoff number.</p>
     */
    static final int SIX_PERSON = 52838;
    /**
     * <p>PER_PERSON is any additional person being added for the LICO.</p>
     */
    static final int PER_PERSON = 5989;
    /**
     * <p>Representing the number 1.</p>
     */
    static final int ONE = 1;
    /**
     * <p>Representing the number 2.</p>
     */
    static final int TWO = 2;
    /**
     * <p>Representing the number 3.</p>
     */
    static final int THREE = 3;
    /**
     * <p>Representing the number 4.</p>
     */
    static final int FOUR = 4;
    /**
     * <p>Representing the number 5.</p>
     */
    static final int FIVE = 5;
    /**
     * <p>Representing the number 6.</p>
     */
    static final int SIX = 6;
    /**
     * <p>Representing the number 7.</p>
     */
    static final int SEVEN = 7;
    /**
     * <p>Representing the number 100 for multiplication purposes.</p>
     */
    static final int MULTIPLIER = 100;
    /**
     * <p>The main method to analyze and display from ArrayList Household.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        int count = 0;
        double average = 0;
        double incomeTotal = 0;
        double incomeCut = 0;
        double incomeExceed = 0;
        String incomeExceedee = null;
        double percent = 0;

        List<Household> households = new ArrayList<Household>();
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        DecimalFormat dfmt = new DecimalFormat(".##");

        System.out.println("ID NUMBER" + "\t" + "# OF PEOPLE" + "\t" 
                + "INCOME");
        while (scan.hasNext()) {

            String tempId = scan.next();
            int tempMember = scan.nextInt();
            int tempIncome = scan.nextInt();

            Household tempHome = new Household(tempId, tempMember, tempIncome);
            households.add(tempHome);
        }

        for (Household h: households) {
            count++;
            System.out.println(h.getId() + "\t\t" + h.getMembers() 
            + "\t\t" + h.getIncome());
            incomeTotal += (double) h.getIncome();
            average = (double) incomeTotal / count;
        }

        System.out.println("The average income is: " + fmt1.format(average));
        System.out.println("-------The ID's of the households "
        + "that exceed average income-------");

        for (Household h: households) {
            if (h.getIncome() > average) {
                incomeExceedee = h.getId();      
                System.out.println(incomeExceedee);
            }

        }
        for (Household h: households) {
            percent = (double) MULTIPLIER * (incomeExceed / households.size());
            if (h.getIncome() < MAX_INCOME) {

                if (h.getMembers() == ONE && h.getIncome() < ONE_PERSON) {
                    incomeExceed++;
                } else if (h.getMembers() == TWO 
                        && h.getIncome() < TWO_PERSON) {
                    incomeExceed++;
                } else if (h.getMembers() == THREE 
                        && h.getIncome() < THREE_PERSON) {
                    incomeExceed++;
                } else if (h.getMembers() == FOUR 
                        && h.getIncome() < FOUR_PERSON) {
                    incomeExceed++;
                } else if (h.getMembers() == FIVE 
                        && h.getIncome() < FIVE_PERSON) {
                    incomeExceed++;
                } else if (h.getMembers() == SIX 
                        && h.getIncome() < SIX_PERSON) {
                    incomeExceed++;
                } else if (h.getMembers() == SEVEN 
                        && h.getIncome() < MAX_INCOME) {
                    incomeExceed++;

                }   else if (h.getMembers() > SEVEN) {
                    incomeCut = (double) (((h.getMembers() - SEVEN)
                            * PER_PERSON) + MAX_INCOME);
                    if (h.getMembers() < incomeCut) {
                        incomeExceed++;
                    }
                }    
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Percentage of households below" 
                + " the low income cut-off is: " 
                + dfmt.format(percent) + "%");
    }    
}   
