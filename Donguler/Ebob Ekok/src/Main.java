import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int temp, ebob = 1, ekok;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int n1 = scanner.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int n2 = scanner.nextInt();

        if ( n2 < n1) {
            temp = n2;
            n2 = n1;
            n1 = temp;
        }
        for (int i = 1; i <= n1; i++){
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Girdiğiniz sayıların EBOB'u: " + ebob);

        ekok = (n1 * n2) / ebob;
        System.out.println("Girdiğiniz sayıların EKOK'u: " + ekok);
    }
}