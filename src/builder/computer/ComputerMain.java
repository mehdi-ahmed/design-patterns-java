package builder.computer;

public class ComputerMain {

    public static void main(String[] args) {

        Computer computerWithoutOptions =
                new Computer.Builder("16GB", "1TB", "Intel i5").Build();


        Computer computerWithOptions =
                new Computer.Builder("32GB", "2TB", "Intel i7")
                        .withBlueToothEnabled(true)
                        .withGraphicCardEnabled(true)
                        .Build();

        System.out.println(computerWithOptions);
        System.out.println(computerWithoutOptions);
    }
}
