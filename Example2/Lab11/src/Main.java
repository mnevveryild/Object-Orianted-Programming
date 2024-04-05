import java.util.ArrayList;
import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(1111,"Ahmet",100000);
        BankAccount a2 = new BankAccount(2222,"Murat",200000);
        BankAccount a3 = new BankAccount(3333,"Canan",300000);
        BankAccount a4 = new BankAccount(4444,"Melih",400000);

        ArrayList myAccounts = new ArrayList<>();

        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);
        a1.balanceChange();

        Iterator itr = myAccounts.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());

        }




    }
}