import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, basValue, result=0;
        System.out.println("Bir sayı giriniz: ");
        number = inp.nextInt();
        while (number!=0){
            basValue = number%10;
            result += basValue;
            number/=10;
        }
        System.out.println(result);
    }
}