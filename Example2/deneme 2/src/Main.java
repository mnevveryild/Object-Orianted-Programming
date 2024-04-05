// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Animal a1 = new Animal("eagle", AnimalTypes.BIRD);
    Animal a2 = new Animal("salmon",AnimalTypes.FISH);
    Animal a3 = new Animal("bear",AnimalTypes.MAMMAL);
    Animal a4 = new Animal("snake",AnimalTypes.REPTILE);

    Animal[] animals = { a1,a2,a3,a4};
    Zoo zoo = new Zoo(animals);
    zoo.printAnimals();
    }
}