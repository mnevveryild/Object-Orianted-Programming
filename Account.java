import java.util.Scanner;

class Account {

    private double balance;
    private String ownerName;

    private int password=1234;


    public Account(String ownerName , double balance){

        this.ownerName=ownerName;

        this.balance=balance;

    }
    public Account(String name){

        this.ownerName=name;

        this.balance=0;

    }
    public void add(double amount){
        balance += amount;
        System.out.println(" hesabınıza %f$ eklendi",
                amount);
    }
    public void withdraw(double amount){
        Scanner input=new Scanner(System.in);
        int enteredpassword= input.nextInt();
        int tries=0;

        while(tries<3){
            if(password==enteredpassword){
                if (this.balance<=amount){
                System.out.println("hesabınızda yeterli miktarda para yok.");
                }else {
                    balance -= amount;
                    System.out.println(amount + " eklendi");
                }

            } else if (password!=enteredpassword) {
            System.out.println("yanlış şifre, lütfen tekrar deneyiniz") ;
            tries+=1;
        }

        }if (tries==3){
            System.out.println("hesabınız bloke oldu");
        }
        public double getBalance() {

        return balance;
    }

    public void setOwnerName(char ownerName) {


        this.ownerName = ownerName;
    }

    public String getOwnerName() {

        return ownerName;
    }



}
