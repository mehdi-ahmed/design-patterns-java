package builder.Person;

import java.util.function.Consumer;


/**
 * There is a downside of the builder using lambda expression.
 * Since the assignments are done in lambda expression the member variables of the builder must be public.
 * Hey! but whats the point of keeping them private, since we can nicely encapsulate the assignment statements in a chain of
 * lambda expressions.
 * And that’s the whole purpose of builder, making object construction easy and readable.
 */

public class PersonBuilder {

    public String salutation;
    public String firstName;
    public String middleName;
    public String lastName;
    public String suffix;
    public Address address;
    public boolean isFemale;
    public boolean isEmployed;
    public boolean isHomeOwner;

    /**
     * ‘with’ methodfactory takes a function of type Consumer. Consumer is a functional interface provided by Java 8,
     * which takes single argument and returns no result. In this case it accepts an object of type person builder
     * which is passed to accept methodfactory. Which means that the instance of the builder would be accessible
     * in the lambda expression and we can do whatever we want.
     * @param builderFunction
     * @return
     */

    public PersonBuilder with(Consumer<PersonBuilder> builderFunction) {
        builderFunction.accept(this);
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
