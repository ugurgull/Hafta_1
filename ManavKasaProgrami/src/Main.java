import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //degiskenler
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlican = 5.00;
        int ArmutKilo, ElmaKilo, DomatesKilo, MuzKilo, PatlicanKilo;


        //scanner tanimla
        Scanner input = new Scanner(System.in);

        //kullanicidan degerleri al
        System.out.print("Armut Kac Kilo ? ");
        ArmutKilo = input.nextInt();

        System.out.print("Elma Kac Kilo ? ");
        ElmaKilo = input.nextInt();

        System.out.print("Domates Kac Kilo ? ");
        DomatesKilo = input.nextInt();

        System.out.print("Muz Kac Kilo ? ");
        MuzKilo = input.nextInt();

        System.out.print("Patlican Kac Kilo ? ");
        PatlicanKilo = input.nextInt();

        //islemler

        double Toplamtutar = (ArmutKilo*Armut)+(ElmaKilo*Elma)+(DomatesKilo*Domates)+(MuzKilo*Muz)+(PatlicanKilo*Patlican);

        System.out.println("Toplam Tutar : " + Toplamtutar);

    }
}
