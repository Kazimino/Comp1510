package q1;

/**
 * <p>The Household class sets and returns the following information
 * in a household.</p>
 *<ul>
 *<li>the number of people in the household.</li>
 *<li>the annual income of the household.</li>
 *<li>the identification number of the household.</li>
 *</ul>
 * @author Justin Chun
 * @version 1.0
 */
public class Household {

    /**
     * <p>private members set as int.</p>
     */
    private int members;
    /**
     * <p>private income set as int.</p>
     */
    private int income;
    /**
     * <p>private id set as String.</p>
     */
    private String id;

    /**
     * <p>Household constructor to set param for id, income and members.</p>
     * @param id set as this.id
     * @param income set as this.income
     * @param members set as this.members
     */
    public Household(String id, int income, int members) {
        this.id = id;
        this.members = members;
        this.income = income;
    }
    /**
     * <p>A mutator method to set new id.</p>
     * @param idNum sets id as idNum
     */
    public void setId(String idNum) {
        this.id = idNum;
    }
    /**
     * <p>An accessor method to return id.</p>
     * @return id
     */
    public String getId() {
        return id;
    }
    /**
     * <p>A mutator method to set new number of members.</p>
     * @param numOfMembers sets members as numOfMembers
     */
    public void setMembers(int numOfMembers) {
        this.members = numOfMembers;
    }
    /**
     * <p>An accessor method to return members.</p>
     * @return members
     */
    public int getMembers() {
        return members;
    }
    /**
     * <p>A mutator method to set new income.</p>
     * @param hIncome sets income as hIncome
     */
    public void setIncome(int hIncome) {
        this.income = hIncome;
    }
    /**
     * <p>An accessor method to return income.</p>
     * @return income
     */
    public int getIncome() {
        return income;
    }
}
