import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;


        while(right > 0) {
            System.out.print("Lutfen kullanici adini giriniz : ");
            userName = input.nextLine();
            System.out.print("Lutfen sifrenizi giriniz : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");
                do {
                    System.out.println("1-Para yatirma\n" +
                            "2-Para cekme\n" +
                            "3-Bakiye sorgulama\n" +
                            "4-Cikis yap");
                    System.out.println("Lutfen yapmak istediginiz islemi seciniz.");
                    select = input.nextInt();
                    if(select == 1){
                        System.out.println("Para miktari : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("Lutfen cekmek istedginiz miktari giriniz : ");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.println("Bakiyeniz yetersiz");
                        } else {
                            balance -= price;
                        }
                    } else {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while ( select != 4);

            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz!");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan hakkiniz " + right);
                }
            }
        }

    }
}