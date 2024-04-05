// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try{
            Student s = new Student(60,99);
            System.out.println(s.getAverage());

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}