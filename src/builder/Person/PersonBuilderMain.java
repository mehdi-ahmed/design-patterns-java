package builder.Person;

public class PersonBuilderMain {

    public static void main(String[] args) {

        Person person = new PersonBuilder()
                .with(peronBuilder -> {
                    peronBuilder.salutation = "Mr.";
                    peronBuilder.firstName = "Mehdi";
                    peronBuilder.middleName = "NA";
                    peronBuilder.lastName = "Ahmed";
                    peronBuilder.isFemale = false;
                    peronBuilder.suffix = "Medd";
                    peronBuilder.address = new AddressBuilder()
                            .with(addressBuilder -> {
                                addressBuilder.city = "Gent";
                                addressBuilder.state = "Flanders";
                                addressBuilder.street = "Overpoortstraat";
                                addressBuilder.pin = "9000";

                            })
                            .build();


                })
                .build();


        System.out.println(person);


        Person personWithChaining = new PersonBuilder()
                .with(personBuilder -> {
                    personBuilder.salutation = "Mr.";
                    personBuilder.firstName = "Mehdi";
                    personBuilder.middleName = "NA";
                    personBuilder.lastName = "Ahmed";
                    personBuilder.isFemale = false;
                    personBuilder.suffix = "Medd";
                })
                .with(personBuilder -> personBuilder.isHomeOwner = false)
                .build();

        System.out.println(personWithChaining);


        //Another way to write it


        Person anotherPerson = new PersonBuilder()
                .with($ -> {
                    $.salutation = "Mr.";
                    $.firstName = "MisterX";
                    $.middleName = "NA";
                    $.lastName = "Ahmed";
                    $.isFemale = false;
                    $.suffix = "Mark";
                    $.address = new AddressBuilder()
                            .with($_addressBuilder -> {
                                $_addressBuilder.city = "Montreal";
                                $_addressBuilder.state = "Canada";
                                $_addressBuilder.street = "BlaBlaStreet";
                                $_addressBuilder.pin = "9000";

                            })
                            .build();
                })
                .with($ -> $.isHomeOwner = true)
                .build();

        System.out.println(anotherPerson);


    }


}
