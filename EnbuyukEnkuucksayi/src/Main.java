import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner sinifimizi tanimliyoruz
        Scanner input = new Scanner(System.in);

        //degiskenlerimizi girelim
        int sayi,n,min = 0, max = 0;

        //kullanicidan degerlerimizi alalim
        System.out.print("Kac tane sayi gireceksiniz : ");
        n = input.nextInt();


        //islemlerimizi yapalim
        for (int i = 1; i <= n; i++){
            System.out.print(i + ".Sayiyi giriniz : ");
            sayi = input.nextInt();

            if (sayi > max){
                max = sayi;
            }
            if(sayi < min || min == 0){
                min = sayi;
            }
        }
        System.out.println("En buyuk sayi : " + max);
        System.out.println("En kucuk sayi : " + min);


    }
}
