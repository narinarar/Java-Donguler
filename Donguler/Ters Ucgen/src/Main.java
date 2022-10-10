import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        number = scanner.nextInt();

        for (int i = number; i > 0 ; i--){

            for (int k = number - i; k > 0; k--){
                System.out.print(" ");
            }

            for (int j=(2 * i)-1; j > 0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }

    }
}