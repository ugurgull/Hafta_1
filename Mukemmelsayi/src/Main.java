import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner sinifini tanimlayalim
        Scanner input = new Scanner(System.in);

        //kullanicidan deger alalim
        System.out.print("Bir sayi giriniz : ");
        int n = input.nextInt();
        int total = 0;



        //islemlerimizi yapalim

        for (int i =1; i < n; i++) {
            if(n % i == 0){
                total = total + i;
            }

        }
        System.out.println("Sonuc " + total);
        if(total == n){
            System.out.println("Mukemmel sayidir.");
        } else {
            System.out.println("Mukemmel sayi degildir.");
        }
    }
}
