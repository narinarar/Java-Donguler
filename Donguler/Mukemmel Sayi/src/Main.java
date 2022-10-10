import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        for (int i =1; i <= number -1; i++){
            if (number %i == 0) {
                sum += i;
            }
        }

        if (sum == number){
            System.out.println(number + " Mükemmel sayıdır.");
        }
        else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }


    }
}