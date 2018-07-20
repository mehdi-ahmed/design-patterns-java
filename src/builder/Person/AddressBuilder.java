package builder.Person;

import java.util.function.Consumer;

public class AddressBuilder {

    public String city;
    public String state;
    public String street;
    public String pin;

    public AddressBuilder with(Consumer<AddressBuilder> builderFunction) {
        builderFunction.accept(this);
        return this;
    }

    public Address build() {
        return new Address(this);
    }


    @Override
    public String toString() {
        return "AddressBuilder{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
