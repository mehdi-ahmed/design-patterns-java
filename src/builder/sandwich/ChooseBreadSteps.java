package builder.sandwich;

public interface ChooseBreadSteps {

    public ChooseMeatStep withMeat(final String meat);

    public AddVeggiesStep vegan();
}
