package builder.sandwich;

public class SandwichBuilderMain {

    public static void main(String[] args) {

        Sandwich.make("White", cfg -> cfg
                .withMeat("parma")
                .withCheese("cheedar")
                .addVeggie("salad")
                .close());

        Sandwich.make("brown", cfg -> cfg
                .withMeat("salami")
                .noCheese()
                .close());

        Sandwich.make("spelt", cfg -> cfg
                .vegan()
                .addVeggie("salad")
                .addVeggie("gherkins")
                .addVeggie("tomatoes")
                .close()
        );

    }
}
