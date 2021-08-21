import java.util.Hashtable;

public class HashtableDemo1 {
    public static void main(String[] args) {
        /**
         *  Hashtable demo
         *  key value pairs
         */
        Hashtable myMap = new Hashtable();
        myMap.put(10,"Ravi");
        myMap.put(101,"Rambabu");
        myMap.put(300,"Kiran");
        // myMap.put(null,"NullPointerException");
        // null key and null values are not allowed in HashMap
        // myMap.put(11,null);
        System.out.println(myMap);
        System.out.println();
    }
}
