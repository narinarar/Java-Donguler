import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, total =1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        a = scanner.nextInt();
        System.out.print("Üs olacak sayı: ");
        b = scanner.nextInt();

        for (int i = 1; i <= b; i ++){
            total *= a;
        }
        System.out.println(a + " üssü " + b + " = " + total);


    }
}