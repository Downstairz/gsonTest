/**
 * Created with IntelliJ IDEA.
 * User: buddha
 * Date: 2/6/14
 * Time: 7:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class About {
    private String firstName;
    private String lastName;
    private String alias;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "About{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
