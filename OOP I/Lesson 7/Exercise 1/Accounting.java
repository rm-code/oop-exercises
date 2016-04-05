public class Accounting {
    public static void main( String[] args ) {
        Account accountOne = new Account("Henrich Maier", (long)(Math.random() * 1000000));
        Account accountTwo = new Account("Hanna Mueller", (long)(Math.random() * 1000000));

        accountOne.deposit(3033.12f);
        accountOne.withdraw(33.12f);
        accountOne.withdraw(10.12f);
        accountOne.withdraw(101.12f);
        accountOne.printStatement();

        accountTwo.deposit(1200.01f);
        accountTwo.withdraw(100.12f);
        accountTwo.deposit(600.12f);
        accountTwo.withdraw(11.09f);
        accountTwo.printStatement();
    }
}
