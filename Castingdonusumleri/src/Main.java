import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sinifimiz tanimlayalim
        Scanner input = new Scanner(System.in);

        //kullanicidan deger alalim
        System.out.print("Tam sayi giriniz : ");
        int myInt = input.nextInt();
        double intDouble = myInt;

        System.out.print("Ondalikli sayi giriniz : ");
        double myDouble = input.nextDouble();
        int doubleInt = (int) myDouble;


        //ceviri(casting) islemlerimizi yapalim

        System.out.println(myDouble + " ondalık sayısının tam sayı hali: " + doubleInt );
        System.out.println(myInt + " tam sayısının ondalık hali: " + intDouble);

    }
}