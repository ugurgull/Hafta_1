import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, toplam = 0, sayi = 0;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        k =input.nextInt();



        for(int i= 0; i <= k; i++){
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayi++;
            }
        }   ortalama = toplam / sayi;

        System.out.println("3 ve 4 'e bolunun sayilarin ortalamasi : " + ortalama);
    }
}
