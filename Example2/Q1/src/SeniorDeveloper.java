public class SeniorDeveloper extends  RegularDeveloper implements PromotionBehaviour {



    public SeniorDeveloper(int id, String fullName, double monthlySalary) {
        super(id, fullName, monthlySalary);
    }

    @Override
    public double Promotion() {
        return 1.5*monthlySalary;
    }
    @Override
    double income() {
        return monthlySalary+Promotion();
    }
}
