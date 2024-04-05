public class Developer extends Employee implements Task{

    public Developer(String name, String lname, int id) {
        super(name, lname, id);
    }

    
    @Override
    public void task() {
        System.out.println(name + "  " + lname + " 's job is Developer." + name + "'s expert developer.");
    }
    }

