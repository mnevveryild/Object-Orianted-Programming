public class FreelanceDeveloper extends Developer implements BonusSalaryBehaviour {

    int unitPrice;
    int hours;

    @Override
    public double getBonusSalary() {
        return hours*1.5;

    }

    double income(){
        return hours*unitPrice+getBonusSalary();
    }
}
