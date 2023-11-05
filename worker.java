import java.util.Scanner;

public class worker {
    public static void main(String[] args) {

        String isim;
        int socialSecurityNumber;
        float wage;
        int workingHours;

        Scanner scan = new Scanner(System.in);

        System.out.println("çalışanın ismini giriniz lütfen");
        isim = scan.next();

        System.out.println("çalışanın sosyal güvenlik numarasını giriniz lütfen");
        socialSecurityNumber = scan.nextInt();

        System.out.println("çalışanın ücretini giriniz lütfen");
        wage = scan.nextFloat();

        System.out.println("çalışanın çalışma saatini giriniz lütfen");
        workingHours = scan.nextInt();

        displayInfo(isim, socialSecurityNumber);
        displaySalary(wage, workingHours);

    }

    public static void displayInfo(String isim, int socialSecurityNumber) {
        System.out.println("İsim:  " +isim + "   Numara:  "+ socialSecurityNumber);

    }

    public static void displaySalary(float wage, int workingHours) {

        float salary;
        salary = wage * workingHours;

        System.out.println( "Maaş :   " +salary);

    }
  }

