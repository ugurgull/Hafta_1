import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, age, yolculukTipi;
        double perKm = 0.10, cocukIndirimi = 0.50, gencIndirimi = 0.10, yasliIndirimi = 0.30, gidisdonusIndirimi = 0.20;
        double biletFiyati;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen mesafeyi km cinsinden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Lutfen yasinizi giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek yon, 2 => Gidis Donus) : ");
        yolculukTipi = input.nextInt();


        if ((mesafe > 0 && age > 0) && (yolculukTipi == 1 || yolculukTipi == 2)) {

            biletFiyati = mesafe * perKm;

            if(age < 12){
                biletFiyati -= biletFiyati*cocukIndirimi;
            } if(age >= 12 && age <= 24){
                biletFiyati  -= biletFiyati*gencIndirimi;
            } if(age > 65){
                biletFiyati  -= biletFiyati*yasliIndirimi;
            } if(yolculukTipi == 2){
                biletFiyati -= biletFiyati*gidisdonusIndirimi;
                biletFiyati *= 2;
            }
            System.out.println("Toplam fiyat : " + biletFiyati + "Tl");

        }else{
            System.out.println("Hatali Giris Yaptiniz.");
        }
    }
}
