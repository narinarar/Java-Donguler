import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = 0, counter, min = 1, max = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        counter = scanner.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = scanner.nextInt();
        }

        if (number == 1) {
            max = number;
            min = number;
        }

        if (number > max) {
            max = number;
        } else if (number < min) {
            min = number;
        }

        System.out.println("En büyük sayı: " + max);
        System.out.print("En küçük sayı: " + min);

    }
}
