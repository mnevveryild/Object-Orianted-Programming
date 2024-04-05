public class Car {

    public static String carName;
    public static String carColor;
    public static int carFuel;
    public static int h;


    public static void Hızlan(int h ){
        if(h<50){
            h=h+40;
        } else if (h>70) {
            System.out.printf("hızınız %d yavaşlayınız", h);
            h=h-20;
        }
        System.out.printf("\n yeni hızınız %d ", h );

    }

    public static void Benzin(int b){
        if(b<30){
            System.out.printf("en yakın benzin istasyonuna gidiniz");
        }else{
            System.out.println("\n devam edebilirsiniz....");
        }
    }

}
