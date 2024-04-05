public class Person {

   private String where;
   private int id;
   private String firstName;
   private String lastName;
   private int age;

   private static int nextId = 1;

   public Person(String where, String firstName,String lastName,int age,int id){
       this.age=age;
       this.where=where;
       this.id=id;
       this.firstName=firstName;
       this.lastName=lastName;
   }

   public Person(String firstName,String lastName){
       this.lastName=lastName;
       this.firstName=firstName;
       this.age=0;
       this.id=nextId++;

   }

   public Person(int id){
       this.firstName=null;
       this.where=null;
       this.age=0;
       this.lastName=null;
       this.id=id;

   }

   public Person() {
        this.id=nextId++;
        this.lastName=null;
        this.age=0;
        this.where=null;
        this.firstName=null;

   }

    public String getFirstName() {
        return firstName;
    }
    public String getWhere(){
       return where;
    }

    public String getLastName(){
       return lastName;
    }
    public void setLastName(String lastname){
       this.lastName=lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public static void Print(){
        System.out.println("---------------------------------------");
    }

}

