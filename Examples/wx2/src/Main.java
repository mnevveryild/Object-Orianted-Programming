import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.next();
        switch(name){

            case "Professional":
                CanonProfessional prof =new CanonProfessional("ayşe");
                prof.coloredPrint();
                break;
            case "Office" :
                break;
            case "Basic":
                break;
        }

    }
}