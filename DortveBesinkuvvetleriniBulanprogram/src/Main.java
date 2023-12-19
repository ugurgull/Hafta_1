import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,i ;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a maximum number : ");
        n = input.nextInt();

        System.out.println("4 Sayisinin kuvvetleri : ");
        for(i = 1; i <= n; i*=4) {
            System.out.println(i);
        }
        System.out.println("5 sayisinin kuvvetleri : ");
        for (i =1 ; i<= n; i*= 5){
            System.out.println(i);
        }

    }
}
