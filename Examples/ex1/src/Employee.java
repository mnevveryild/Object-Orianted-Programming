public class Employee {

    String name;
    String lname;
    int id;

    public Employee(String name, String lname, int id) {
        this.name = name;
        this.lname=lname;
        this.id=id;
    }

    @Override
    public String toString() {
        return  name + " " +
                lname + " " +
                id ;
    }
}
