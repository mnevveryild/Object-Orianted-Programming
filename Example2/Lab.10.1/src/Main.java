
public class Main {
    public static void main(String[] args) {
        PhDStudent p1 = new PhDStudent(1111,65f,56f,10,20);
        System.out.println(p1.computeTotalScore());

        BachelourStudent p2 = new BachelourStudent(2222,46f,56f);
        System.out.println(p2.computeTotalScore());

        MasterStudent p3 = new MasterStudent(3333,78f,64f,30);

        System.out.println(p3.computeTotalScore());

    }
}