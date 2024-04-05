public abstract class Student {
    private int id;
    private float mid;
    private float fin;

    public Student(int id,float mid,float fin ) {
        this.fin=fin;
        this.id=id;
        this.mid=mid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMid() {
        return mid;
    }

    public void setMid(float mid) {
        this.mid = mid;
    }

    public float getFin() {
        return fin;
    }

    public void setFin(float fin) {
        this.fin = fin;
    }

    public abstract float computeTotalScore();

    public float computeBaseScore(){
        return (float) (mid*0.4+fin*0.6);
    }
}
