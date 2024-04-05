public class Employee {
    private int id;
    private String name;
    public static String companyName;

    int number;
    static int _number;

    public Employee(int id, String name){

        this.id=id;
        this.name=name;
        number++;
        _number++;
    }


}
