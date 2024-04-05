import java.util.Scanner;

public class AdultOrTeenager {
    public static void main (String[]args){
        Scanner age= new Scanner(System.in);

        System.out.println("yaşınız kaç ?");
        int age1= age.nextInt();

        if(age1<18){
            System.out.println("ergensin");
        }else
            System.out.println("yetişkinsin");
    }
}
