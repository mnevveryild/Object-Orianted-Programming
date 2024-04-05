public class Duck extends Animal implements Swimmable,Flyable {

    @Override
    public void swim() {
        System.out.println("Duck is swimmming");
    }

    public void fly(){

        System.out.println("Duck is flying");
    }

    public void move(){
        System.out.println("Duck is moving");
    }


}






