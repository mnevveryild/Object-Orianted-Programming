public class Student {
    public int midterm;
    public int finalExam;

    public Student(int midterm,int finalExam){
        setMidTerm(midterm);
        setFinalExam(finalExam);
    }

    public void setFinalExam(int finalExam){
        if(finalExam<0 || finalExam>100)
        throw new IllegalArgumentException("final exam invalid");
        this.finalExam=finalExam;

    }

    public void setMidTerm(int midterm){
        if(midterm<0 || midterm>100)
            throw new IllegalArgumentException("midterm invalid");

    }

    public int getMidterm(){return midterm;}
    public int getFinalExam(){return finalExam;}

    public double getAverage(){
        return midterm*0.4+finalExam*0.6;
    }

}
