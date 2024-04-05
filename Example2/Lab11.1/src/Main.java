import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> words1 = new ArrayList<>();
        words1.add("sarı");
        words1.add("kırmızı");
        words1.add("mavi");
        words1.add("mor");
        words1.add("yeşil");
        words1.add("turuncu");

        switchPairs(words1);
        System.out.println(words1);

        ArrayList<String> words2 = new ArrayList<>();
        words2.add("çilek");
        words2.add("armut");
        words2.add("muz");
        words2.add("erik");
        words2.add("elma");
        words2.add("kiraz");
        words2.add("vişne");

        switchPairs(words2);
        System.out.println(words2);

    }


        public static void switchPairs(ArrayList<String> list){
            for(int i=0;i<list.size()-1; i+=2){
                String c =list.get(i);
                list.set(i,list.get(i+1));
                list.set(i+1,c);

            }
        }
    }