public class Tester extends Employee {

    public Tester(String name, String lname, int id) {
        super(name, lname, id);
    }

    @Override
    public String toString() {
        return name +"  " + lname + "a tester might be an automation testing expert ";

    }
}
