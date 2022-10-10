import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        int tempNumber = number;
        int total = 0;

        while (tempNumber != 0) {
            total += tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println(total);
    }
}