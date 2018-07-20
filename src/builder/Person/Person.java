package builder.Person;

public class Person {

    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private Address address;
    private boolean isFemale;
    private boolean isEmployed;
    private boolean isHomeOwner;


    public Person(PersonBuilder builder) {

        this.salutation = builder.salutation;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.suffix = builder.suffix;
        this.address = builder.address;
        this.isFemale = builder.isFemale;
        this.isEmployed = builder.isEmployed;
        this.isHomeOwner = builder.isHomeOwner;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public Address getAddress() {
        return address;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public boolean isHomeOwner() {
        return isHomeOwner;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salutation='" + salutation + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", suffix='" + suffix + '\'' +
                ", address=" + address +
                ", isFemale=" + isFemale +
                ", isEmployed=" + isEmployed +
                ", isHomeOwner=" + isHomeOwner +
                '}';
    }
}
