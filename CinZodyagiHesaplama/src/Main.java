import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yearofborn, kalan;
        String nameofAnimal = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Yilinizi Giriniz : ");
        yearofborn = input.nextInt();

        kalan = yearofborn % 12;

        switch (kalan) {
            case 0 :
                nameofAnimal = "Maymun";
                break;
            case  1 :
                nameofAnimal = "Horoz";
                break;
            case 2 :
                nameofAnimal = "Kopek";
                break;
            case 3 :
                nameofAnimal = "Domuz";
                break;
            case 4 :
                nameofAnimal = "Fare";
                break;
            case 5 :
                nameofAnimal = "Okuz";
                break;
            case 6 :
                nameofAnimal = "Kaplan";
                break;
            case 7 :
                nameofAnimal = "Tavsan";
                break;
            case 8 :
                nameofAnimal = "Ejderha";
                break;
            case 9 :
                nameofAnimal = "Yilan";
                break;
            case 10 :
                nameofAnimal = "At";
                break;
            case 11 :
                nameofAnimal = "Koyun";
                break;

        } System.out.println("Cin Zodyagi Yiliniz : " + nameofAnimal);
    }
}
