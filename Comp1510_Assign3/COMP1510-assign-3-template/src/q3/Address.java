package q3;

/**
 * <p>An Address class to hold the values of of an Address including:.</p>
 * <ul>
 * <li>The street name.</li>
 * <li>The city name.</li>
 * <li>the state/province.</li>
 * <li>the postal code.</li>
 * </ul>
 * @author Justin Chun
 * @version 1.0
 */
public class Address {
    /**
     * <p>private streetAddress set as String.</p>
     */
    private String streetAddress;
    /**
     * <p>private city set as String.</p>
     */
    private String city;
    /**
     * <p>private state set as String.</p>
     */
    private String state;
    /**
     * <p>private postalCode set as String.</p>
     */
    private String postalCode;

    /**
     * <p>Address constructor with default params set.</p>
     * @param street as String
     * @param town as String
     * @param st as String
     * @param code as String
     */
    public Address(String street, String town, String st, String code) {
        streetAddress = street;
        city = town;
        state = st;
        postalCode = code;
    }

    /**
     * <p>A toString method to return result after formatting.</p>
     * @return result
     */
    public String toString() {
        String result;

        result = streetAddress + "\n";
        result += city + ", " + state + " " + postalCode;

        return result;
    }

}
