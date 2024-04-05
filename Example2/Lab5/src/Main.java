
public class Main {
    public static void main(String[] args) {

    Person p1 = new Person("Ankara","Münevver","Yıldırım",22,3333);
    p1.setFirstName("Ata");
    p1.setLastName("Türk");
    p1.setAge(38);
    p1.setWhere("İstanbul");
    p1.setId(81);

    Person.Print();


    System.out.println(p1.getFirstName()+"   "+p1.getLastName()+"   "+p1.getAge()+"   "+p1.getWhere()
            +"   " +p1.getAge()+"   "+p1.getId());

    Person.Print();


    Person p2 = new Person("Mustafa","Kemal");
    System.out.println(p2.getId()+"   "+p2.getFirstName()+"   "+p2.getLastName());

    Person.Print();

    Person p3 = new Person(24);
    System.out.println(p3.getId());

    Person.Print();

    Person p4 = new Person();

    System.out.println(p4.getId());



    }
}