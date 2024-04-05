import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner okuyucu = new Scanner(System.in);
        Car car1 =new Car();


        System.out.println("araba modelini giriniz lütfen");
        car1.carName = okuyucu.next();

        System.out.println("araba rengini giriniz lütfen");
        car1.carColor = okuyucu.next();

        System.out.println("benzin miktarını giriniz giriniz lütfen");
        car1.carFuel = okuyucu.nextInt();

        System.out.println("araba hızını giriniz lütfen");
        car1.h = okuyucu.nextInt();

        Car.Hızlan(car1.h);
        Car.Benzin(car1.carFuel);




    }


}