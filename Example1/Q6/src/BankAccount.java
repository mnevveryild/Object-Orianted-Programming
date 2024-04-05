public class BankAccount implements Comparable<BankAccount> {
     int accountNo;
     String holderName;
     double balance;

     BankAccount(int accountNo,String holderName,double balance){
         this.balance=balance;
         this.holderName=holderName;
         this.accountNo=accountNo;

     }

     double balanceChange(double amount){

         balance=balance-amount;
         return balance;


     }

     public int compareTo(BankAccount b ){
         return this.holderName.compareTo(b.holderName);
     }

     public String toString(){
         return holderName+" "+"balance   "+balanceChange(500);
     }



}
