import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year ;

        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        year = input.nextInt();



        if (year % 4 == 0 && year % 400 ==0 || year % 100 !=0){
            System.out.println(year  + " Artik yildir !");
        }
        else {
            System.out.println(year  + " Artik yil degildir !");
        }

    }
}