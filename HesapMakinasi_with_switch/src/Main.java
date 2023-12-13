import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //degiskenlerimizi girelim
        int n1, n2 ,select;

        //scanner sinifimizi tanimlayalim
        Scanner input = new Scanner(System.in);

        //kullanicidan verilerimizi alalim
        System.out.print("Ilk Sayiyi Giriniz : ");
        n1 =input.nextInt();

        System.out.print("Ikinci Sayiyi Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminizi Giriniz : ");
        select = input.nextInt();

        //islemlerimizi yapalim

        switch (select){
            case 1:
                System.out.println("Toplama : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1 * n2));
                break;
            case 4:
                if(n2 != 0) {
                    System.out.println("Bolme : " + (n1 / n2));
                }else {
                    System.out.println("Bir Sayi Sifira Bolunemez");
                }
                break;
            default:
                System.out.println("Hatali Sayi Girdiniz Lutfen Tekrar Deneyiniz");



        }




    }
}
