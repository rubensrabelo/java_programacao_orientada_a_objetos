import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account = new Account("Rubens", 0.0);

        System.out.println();
        System.out.println(account);
        System.out.println();
        
        
        System.out.println("Enter a deposit amount ");
        double amount = input.nextDouble();
        account.deposit(amount);
        
        System.out.println();
        System.out.println(account);

        input.close();
    }
}
