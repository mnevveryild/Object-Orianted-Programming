    enum AnimalTypes{MAMMAL,BIRD,REPTILE,FISH}
    public class Animal {
    private String name;
    private AnimalTypes types;

    public Animal(String name, AnimalTypes types){
        this.name=name;
        this.types=types;

    }

    public String toString(){
        return name+" "+types;
    }
}

