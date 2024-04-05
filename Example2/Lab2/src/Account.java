import java.util.Scanner;
public class Account {
    private double balance;
    private String ownerName;
    private int password = 1234;
    public Account (String name, double balance) {
        this.balance = balance;
        this.ownerName = name;
    }
    public Account (String name) {
        this.balance = 0;
        this.ownerName = name;
    }
    public void add(double amount) {
        this.balance += amount;
        System.out.printf("%f TL hesabına eklendi", amount);   //yerine bir değer yazdıracağımız zaman printf kullanıyoruz.//
    }
    public void withdraw(double amount) {
        Scanner input = new Scanner(System.in);
        System.out.println("4 haneli şifrenizi giriniz lütfen");
        int enteredPassword = input.nextInt();
        int tries = 0;

        while (password!= enteredPassword) {
            tries++;

            if (tries == 3) {
                System.out.println(" ! hesabınız bloke oldu  !  ");
                return;
            }
            System.out.println(" şifre yanlış , tekrar deneyiniz ");
            System.out.println("4 haneli şifrenizi giriniz lütfen");
            enteredPassword = input.nextInt();
        }

        if (this.balance < amount) {
            System.out.println("hesabınızda yeterli miktarda para yok!");
        }
        else {
            System.out.println("Çekme tamamlandı...");

        }


    }
    public double getBalance() {
        return balance;
    }
    public void setOwnerName(String ownerName) {

        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }
}