package builder.bankaccount;

public class BuilderMain {

    public static void main(String[] args) {

        // Without builder Pattern
        // BankAccount account = new BankAccount(456L, "Marge",  100.00,"Springfield", 2.5);
        // BankAccount anotherAccount = new BankAccount(789L, "Homer",  2.5, null, 100.00);

        //With builder Pattern
        BankAccount bankAccount = new BankAccount.Builder(12345L)
                .withOwner("Mehdi")
                .atBranch("Gent")
                .atRate(2.5)
                .openingBalance(100)
                .build();

        System.out.println(bankAccount);

    }
}
