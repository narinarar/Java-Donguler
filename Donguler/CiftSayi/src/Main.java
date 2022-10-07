import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz. ");
        n = scanner.nextInt();

        for (int i = 1; i < n; i ++){
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}