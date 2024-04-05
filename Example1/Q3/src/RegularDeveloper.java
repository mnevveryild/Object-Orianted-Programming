public class RegularDeveloper extends Developer{

    double montlySalary;
    RegularDeveloper(int id,String fullName,double montlySalary){
        super(id,fullName);
        this.montlySalary=montlySalary;
    }

    @Override
    double income() {
        return montlySalary;
    }


}
