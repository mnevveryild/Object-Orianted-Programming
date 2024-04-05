public class SeniorDeveloper extends RegularDeveloper implements PromotionBehaviour{

    public double getPromotion(){
        return 1.5*montlySalary;
    }
    @Override
    double income() {
        return super.income()+getPromotion();
    }


}
