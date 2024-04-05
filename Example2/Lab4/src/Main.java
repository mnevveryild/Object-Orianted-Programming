import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Scanner okuyucu= new Scanner(System.in);
            try {
                System.out.println("değeri giriniz lütfen");
                int deger= okuyucu.nextInt();
            }catch (InputMismatchException exception){
                    System.out.println("lütfen integer bir değer giriniz");
             }
        */

        Worker worker1 =new Worker();
        worker1.setName();

        try{
            worker1.setSalary();
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
           
        }

        Worker worker2 =new Worker();
        worker2.setName();
        try{
            worker2.setSalary();
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());

        }
        Worker worker3 =new Worker();
        worker3.setName();
        try{
            worker3.setSalary();
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());

        }

        System.out.printf( " %d adet çalışan vardır" , Worker.counter);

    }
}