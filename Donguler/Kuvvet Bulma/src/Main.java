import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n = scanner.nextInt();

        for(int i = 1; i <= n; i ++)
        {
            if(i % 4 == 0 && i % 5 == 0)
            {
                System.out.println("Girilen sayıya kadar 4'ün ve 5'in kuvvetleri: " + i);
            }
        }

    }
}