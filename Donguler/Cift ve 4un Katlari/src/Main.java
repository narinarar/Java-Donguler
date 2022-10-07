import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            n = scanner.nextInt();
            if ((n % 2 == 0) && (n % 4 == 0)) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.println("Çift ve 4'ün katı olan sayıların toplamı: " + total);


    }
}