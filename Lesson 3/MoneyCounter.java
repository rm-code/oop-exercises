/* OOP Lesson 3 - Exercise 4 */
public class MoneyCounter {
    public static void main(String[] args) {
        float money = 4.73f; // The value to calculate the change for.

        // Full Euro
        // Basically we divide the full amount by the "worth" of the coin.
        // This gives us how many coins we have of a certain type.
        // Now we use the original amount and subtract the amount of money we
        // already have "in coins".
        // This can be repeated until we have no more "Euro".
        int euroTwo = (int) (money / 2);
        money = money - (euroTwo * 2); // Alternative: money = money % 2; -> Nice!
        int euroOne = (int) (money / 1);
        money = money - (euroOne);

        // Cents
        // !NOTE! We take the money amount _without_ the full Euro from above (so
        // basilly just the 0.73). We multiply it by 100 to get rid of the floating
        // point numbers and explicitly convert it to integers.
        int cents = (int) (money * 100);

        // The calculation here works the same way we already used for the euro.
        int centsFifty = cents / 50;
        cents = cents - (centsFifty * 50);
        int centsTwenty = cents / 20;
        cents = cents - (centsTwenty * 20);
        int centsTen = cents / 10;
        cents = cents - (centsTen * 10);
        int centsFive = cents / 5;
        cents = cents - (centsFive * 5);
        int centsTwo = cents / 2;
        cents = cents - (centsTwo * 2);
        int centsOne = cents / 1;
        cents = cents - (centsOne);

        System.out.println("2 Euro:  " +     euroTwo);
        System.out.println("1 Euro:  " +     euroOne);
        System.out.println("50 Cent: " +  centsFifty);
        System.out.println("20 Cent: " + centsTwenty);
        System.out.println("10 Cent: " +    centsTen);
        System.out.println("5 Cent:  " +   centsFive);
        System.out.println("2 Cent:  " +    centsTwo);
        System.out.println("1 Cent:  " +    centsOne);
    }
}
