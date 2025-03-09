public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0.0)
            this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0.0)
            balance = amount;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", balance=" + balance + "]";
    }
}
