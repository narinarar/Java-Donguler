import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, a = 1, b = 1, c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}