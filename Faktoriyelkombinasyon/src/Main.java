import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, totaln = 1, totalr = 1, totalfark = 1, fark, sonuc;
        int i;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number N : ");
        n = input.nextInt();

        System.out.print("Enter number R : ");
        r = input.nextInt();


        for (i = 1; i <= n; i++) {
            totaln = totaln * i;
        }
        fark = n - r;
        for (i = 1; i <= r; i++) {
            totalr = totalr * i;
        }
        for (i = 1; i <= fark; i++) {
            totalfark = totalfark * i;
        }
        sonuc = totaln / (totalr * totalfark);
        System.out.println("N sayisinin R' li kombinasyonu : " + sonuc);


    }
}