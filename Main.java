
public class Main {
    public static void main(String[]args){
        Account ac= new Account("münevver yıldırım", 1200000);
        System.out.println(ac.getOwnerName() +" 'nın bilançosu" + ac.getBalance());

        ac.withdraw(35000);
        System.out.println(ac.getOwnerName() + " 'nın bilançosu "+ ac.getBalance());

        ac.add(5000);
        System.out.println(ac.getOwnerName()+" 'nın bilançosu"+ ac.getBalance());

        ac.withdraw(100000);
        System.out.println(ac.getOwnerName()+"' nın bilançosu "+ ac.getBalance());

        ac.setOwnerName("münevver yıldırım");
        System.out.println(ac.getOwnerName()+" ' nın bilançosu" + ac.getBalance());

    }
}