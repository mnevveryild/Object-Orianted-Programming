import java.util.Scanner;

public class Worker {
    private String name;
    private int salary;
    static int counter;

    Scanner okuyucu =new Scanner(System.in);
    public Worker(){
        counter++;
    }

    public void setName(){
        System.out.println("çalışanın ismini giriniz");
        this.name= okuyucu.next();
    }

    public void setSalary(){
        System.out.println("çalışanın maaşını giriniz");
        this.salary= okuyucu.nextInt();
        if(salary<=0){
            throw new IllegalArgumentException(" maaş değeri 0'dan büyük olmalı");
        }
    }

}
