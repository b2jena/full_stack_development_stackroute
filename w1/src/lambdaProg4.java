import java.util.ArrayList;
import java.util.List;

public class lambdaProg4 {
    public static void main(String[] args) {
        List<String> mygames = new ArrayList<String>();
        mygames.add("Chess");
        mygames.add("Hockey");
        mygames.add("Kabaddi");
        mygames.add("Cricket");

        //for(String name : mygames){
        //    System.out.println(name);
        //}

        //for each using lambda expressions
        mygames.forEach(name-> System.out.println(name));
        //double colon operator in java 8
        System.out.println("double colon operator : ....");
        mygames.forEach(System.out::println);
    }
}
