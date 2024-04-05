public class BankAccount {

    int accountNo;
    String holderName;
    double balance;

    public BankAccount(int accountNo,String holderName,double balance) {
        this.accountNo = accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void balanceChange(){
        this.balance=getBalance()-500;
    }

    @Override
    public String toString() {
        return
                "accountNo=" + accountNo +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance
                ;
    }
}
