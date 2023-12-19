import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayisini giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayisini giriniz : ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok = 1;

        for (int i = 1; i <= n1; i++){
            if (n1 % i ==0 && n2 % i ==0){
                ebob = i;
            }
        }
        System.out.println("EBOB : " + ebob);


        for(int i = 1; i <= (n1 * n2); i++ ){
            if (i % n1 == 0 && i % n2 == 0 ){
                System.out.println("EKOK : " + i);
                break;
            }
        }
    }
}
