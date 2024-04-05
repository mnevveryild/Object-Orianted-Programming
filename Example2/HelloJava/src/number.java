import java.util.Scanner;

public class number {
    public static void main (String[]args){
        Scanner number = new Scanner(System.in);
        
        System.out.println("bir sayi giriniz");
        int number1= number.nextInt();
        System.out.println("bir sayi giriniz");
        int number2= number.nextInt();
        System.out.println("bir sayi giriniz");
        int number3= number.nextInt();
        
        if(number1<number2 && number2<number3) {
            System.out.println(" en büyük sayı  " + number3);

        } else if (number2<number3 && number3<number1) {
            System.out.println(" en büyük sayı  " + number1);
            
        } else if (number3<number2 && number1<number2) {
            System.out.println(" en büyük sayı  " + number2);

        }

    }
}
