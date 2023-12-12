import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //degiskenler
        double boy, kilo, vucutkutleindeksi;

        //scanner sinifi
        Scanner input = new Scanner(System.in);

        //kullanicidan deger al
        System.out.print("Lutfen Boyunuzu Giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lutfen kilonuzu Giriniz : ");
        kilo = input.nextInt();

        //islemler

        vucutkutleindeksi =  (kilo)/(boy*boy);

        System.out.println("Vucut Kutle Indeksiniz : " + vucutkutleindeksi);


    }
}
