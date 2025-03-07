import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert a value: ");
        String value = input.nextLine();

        System.out.println("The value inserted was: " + value);

        input.close();
    }
}
