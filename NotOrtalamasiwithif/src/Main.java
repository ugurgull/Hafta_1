import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //degisklenler
        int mat, fizik, turkce, kimya, muzik, sinir =55;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("Turkce Notunu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Muzik Notunu Giriniz : ");
        muzik= input.nextInt();


        if (mat < 0 || mat > 100 || fizik < 0 || fizik > 100 ||
                kimya < 0 || kimya > 100 || turkce < 0 || turkce > 100 || muzik < 0 || muzik > 100) {

            System.out.println("Yanlış giriş yaptınız. Lütfen 0-100 arasında notlar giriniz.");

        } else {
            double ortalama = (mat + fizik + kimya + turkce + muzik) / 5.0;
            System.out.println("Not ortalaması: " + ortalama);

            if (ortalama >= sinir) {
                System.out.println("Ortalamanız 55 üzerinde. Geçtiniz");

            } else {
                System.out.println("Kaldınız.");
            }
            System.out.println("Ortalamanız : " + ortalama);


        }
    }
}


