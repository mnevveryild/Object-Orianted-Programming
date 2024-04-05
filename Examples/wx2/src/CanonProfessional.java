public class CanonProfessional extends Printer implements ColoredPrint{

    public CanonProfessional(String name) {
        super(name);
    }

    @Override
    public void coloredPrint() {

        System.out.println("renkli çıktı");

    }
}
