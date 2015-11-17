public class Account {
    String owner;
    float  balance;
    long   number;

    public Account( String owner, long number ) {
        this.owner  = owner;
        this.number = number;
        balance = 0.0f;
    }

    public void deposit( float delta ) {
        balance += delta;
    }

    public void withdraw( float delta ) {
        balance -= delta;
    }

    public void printStatement() {
        System.out.println("==========================");
        System.out.println("Owner:   " + owner);
        System.out.println("Account: " + number);
        System.out.println("Balance: " + balance);
        System.out.println("==========================");
    }
}
