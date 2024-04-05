public class RegularDeveloper extends Developer{
    double monthlySalary;

    public RegularDeveloper(int id,String fullName, double monthlySalary) {
        super(fullName,id);
        this.monthlySalary = monthlySalary;
    }

    double income(){
        return monthlySalary;
    }

}
