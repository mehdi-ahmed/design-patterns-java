package builder.sandwich;

public interface ChooseMeatStep {

    public ChooseCheeseStep withCheese(final String cheese);

    public AddVeggiesStep noCheese();
}
