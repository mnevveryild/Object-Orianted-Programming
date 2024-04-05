public class FreelanceDeveloper extends Developer implements BonusSalaryBehaviour{
    int unitPrice;
    int hours;

    public FreelanceDeveloper(String fullName, int id, int hours) {
        super(fullName, id);
        this.hours = hours;
    }

    @Override
    public double BonusSalaryBehaviour() {
        return hours*1.5;
    }

    @Override
    double income() {
        return hours*unitPrice+BonusSalaryBehaviour();
    }
}
