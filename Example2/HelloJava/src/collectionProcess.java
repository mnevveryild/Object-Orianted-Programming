import java.util.Scanner;

public class collectionProcess {
    public static void main(String[]args){
        Scanner number = new Scanner(System.in);
        System.out.println("bir sayı giriniz lütfen");
        int number1= number.nextInt();

        System.out.println("bir sayı daha giriniz lütfen");
        int number2 =number.nextInt();

        int toplam = number1 + number2;

        System.out.println(" toplam : " +toplam);
    }
}
