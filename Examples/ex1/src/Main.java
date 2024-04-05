
public class Main {
    public static void main(String[] args) {

        Developer developer = new Developer("Münevver","Yıldırım",1111);
        developer.toString();
        developer.task();
        
        Manager manager = new Manager("melek","yıldırım",2222);

        System.out.println(manager.toString());
    }
}