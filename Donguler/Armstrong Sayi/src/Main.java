import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir. */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();
        int tempNum = number;
        int basNumber = 0;
        int basValue;
        int basPow;
        int result = 0;

        while (tempNum != 0) {
            tempNum /= 10;
            basNumber++;
        }

        tempNum = number;
        while (tempNum != 0) {
            basValue = tempNum % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i ++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNum /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı Armstrong sayıdır.");
        }else {
            System.out.println(number + " sayısı Armstrong sayısı değildir.");
        }


    }
}