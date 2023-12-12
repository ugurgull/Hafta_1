import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //degiskenlerimiz
        int a, b, c;

        //scanner sinifini tanimlayalim
        Scanner input = new Scanner(System.in);

        //kullanicidan verilerimizi alalim
        System.out.print("A Sayisinin Degeri : ");
        a = input.nextInt();

        System.out.print("B Sayisinin Degeri : ");
        b = input.nextInt();

        System.out.print("C Sayisinin Degeri : ");
        c = input.nextInt();

        //islemlerimiz
        int sonuc = a + b * c -b;

        System.out.println("Islemin Sonucu :" + sonuc);

    }
}