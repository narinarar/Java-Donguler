import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, sub;
        double comb, nFac = 1, rFac = 1, sFac = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kombinasyonun n değerini giriniz: ");
        n = scanner.nextInt();
        System.out.print("Kombinasyonun r değerini giriniz: ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i ++){
            nFac = nFac * i;
        }

        for (int j = 1; j <= r; j ++){
            rFac = rFac * j;
        }

        sub = ( n - r);
        for (int k = 1; k <= sub; k ++){
            sFac = sFac * k;
        }

        comb = nFac / (rFac * sFac);

        System.out.println("C(" + n + "," + r + ")=" + comb);







    }
}