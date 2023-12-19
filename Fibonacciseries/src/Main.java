import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        //scanner sinifimizi tanimlayalim
        Scanner input = new Scanner(System.in);

        //kullanicidan deger alalim
        System.out.print("Eleman sayisini giriniz : ");
        int n =input.nextInt();
        int n1=0, n2=1;

        //islemlerimizi yapalim
        for (int i = 1; i < n; i++) {
            int next=n1 + n2;
            System.out.println(" " + next);
            n1=n2;
            n2=next;
        }

    }
}
