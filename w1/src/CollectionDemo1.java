import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class CollectionDemo1 {
    public static void main(String[] args) {
        HashSet<String> myset = new HashSet<String>();

        myset.add("Bikash");
        myset.add("Hyderabad");
        myset.add("JAVA");
        myset.add("check the index");
        System.out.println(myset);

        for(String s : myset){
            System.out.println(s);
        }
        // use other data structures here
        System.out.println();
    }
}
