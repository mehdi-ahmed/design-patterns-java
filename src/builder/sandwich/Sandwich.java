package builder.sandwich;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Sandwich {

    private final String bread;
    private final String meat;
    private final String cheese;
    private final List<String> vegetables;

    protected Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.vegetables = Collections.unmodifiableList(builder.vegetables);
    }

    public static Sandwich make(String bread, Function<ChooseBreadSteps, CloseStep> configuration) {
        return configuration.andThen(CloseStep::create).apply(new Builder(bread));
    }


    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getVegetables() {
        return vegetables;
    }
}
