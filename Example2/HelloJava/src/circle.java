import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);


        System.out.println("dairenin yarıçapını giriniz lütfen");
        int radius1 = radius.nextInt();

        System.out.println("dairenin alanını hesaplamak istiyorsanız 1 çevresini" +
                "hesaplamak istiyorsanız 2 yazınız");
        int secim = radius.nextInt();
        double islem = 0.0;

        switch (secim) {
            case 1:
                islem = 3.14 * radius1 * radius1;

                break;
            case 2:
                islem = 2 * 3.14 * radius1;

                break;


        }

        System.out.println("sonuç  "+islem);

    }
}
