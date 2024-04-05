public abstract class Developer {
    String fullName;
    int id;

    public Developer(String fullName,int id) {
        this.fullName = fullName;
        this.id=id;
    }

    abstract double income();
}
