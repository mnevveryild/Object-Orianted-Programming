public abstract class Student {

    private int id;
    private float mid;
    private float fin;

    Student(int id,float mid,float fin){
        this.mid=mid;
        this.id=id;
        this.fin=fin;

    }

    abstract float computeTotalScore();
    float computeBaseScore(){
        return (float) (mid*0.4+fin*0.6);
    }




}
