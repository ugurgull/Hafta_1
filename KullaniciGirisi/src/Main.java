import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //degiskenleri gir
        String userName, password, select, newPassword;

        //scanner sinifi tanimla
        Scanner input = new Scanner(System.in);

        //kullanicidan bilgileri al
        System.out.print("Kullanici Adiniz : ");
        userName = input.nextLine();

        System.out.print("Sifrenizi Giriniz : ");
        password = input.nextLine();

        //islemlerimizi yapalim

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris Yaptiniz");

        }else if(userName.equals("patika") && !(password.equals("java123"))) {
            System.out.print("Bilgileriniz Yanlis Sifrenizi Olusturmak Ister misiniz?( evet ya da hayir) ");
            select = input.nextLine();

            if(select.equals("evet") || select.equals("Evet")){
                System.out.print("Yeni Sifrenizi Giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")){
                    System.out.println("Sifre olusturulamadi Lutfen onceden kullanmadiginiz bir sifre giriniz");

                }else
                    System.out.println("Sifre Olusturuldu");


            }  else{
                System.out.println("Sifre olusturmadiniz");

            }
        }else {
            System.out.println("Bilgiler yanlis");
        }
    }
}
