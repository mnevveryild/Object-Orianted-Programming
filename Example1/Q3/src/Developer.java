public abstract class Developer {

    String fullName;
    int id;


    Developer(int id,String fullName){
        this.id=id;
        this.fullName=fullName;

    }
    abstract double income();


}
