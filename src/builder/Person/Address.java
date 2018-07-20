package builder.Person;

public class Address {

    private String city;
    private String state;
    private String street;
    private String pin;

    public Address(AddressBuilder addressBuilder) {

        this.city = addressBuilder.city;
        this.state = addressBuilder.state;
        this.street = addressBuilder.street;
        this.pin = addressBuilder.pin;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public String getPin() {
        return pin;
    }
}
