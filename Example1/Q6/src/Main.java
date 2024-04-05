import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        BankAccount a1 = new BankAccount(1,"ali",10000);
        BankAccount a2 = new BankAccount(2,"mehmet",10000);
        BankAccount a3 = new BankAccount(3,"hasan",10000);

        List<BankAccount> myAccounts = new ArrayList<>();

        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);

        Collections.sort(myAccounts);

        for(BankAccount b : myAccounts){
            System.out.println(b);
        }





    }
}