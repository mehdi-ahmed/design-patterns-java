package builder.sandwich;

public interface ChooseCheeseStep {

    public AddVeggiesStep addVeggie(final String vegetable);

    public CloseStep noVeggies();
}
