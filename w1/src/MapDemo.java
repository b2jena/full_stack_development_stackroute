import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Default Initialization of a
        // Map
        Map<Integer, String> hm1 = new HashMap<>();

        // Initialization of a Map
        // using Generics
        Map<Integer, String> hm2 = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(1, "WandaVision");
        hm1.put(2, "THE FALCON AND THE WINTER SOLDIER");
        hm1.put(3, "l 0 k !");

        hm2.put(new Integer(1), "Avengers");
        hm2.put(2, "Avengers : Age of Ultron");
        hm2.put(new Integer(3), "Avengers : Infinity War");
        hm2.put(4, "Avengers : Endgame");

        System.out.println(hm1);
        System.out.println(hm2);

        //size function
        System.out.println(hm1.size());  //3
        System.out.println(hm2.size());  //3

        //boolean containsKey(Object key)
        //Returns true if this map contains a mapping for the specified key. More formally,
        // returns true if and only if this map contains a mapping for a key k such that
        // (key==null ? k==null : key.equals(k)). (There can be at most one such mapping.)
        System.out.println(hm1.containsKey(3));
        System.out.println(hm1.containsKey(4));
        //System.out.println("\n");

        //boolean containsValue(Object value)
        //Returns true if this map maps one or more keys to the specified value. More formally,
        // returns true if and only if this map contains at least one mapping to a value v such that
        // (value==null ? v==null : value.equals(v)).
        // This operation will probably require time linear in the map size for most implementations of the
        // Map interface.
        System.out.println(hm1.containsValue("WANDAVISION"));  //case sensitive
        System.out.println(hm2.containsValue("Avengers"));

        System.out.println(hm1.get(1));  //WandaVision
        hm1.clear();
        System.out.println(hm1);  //all clear

        //keySet() -> Returns a Set view of the keys contained in this map.
        // The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
        System.out.println(hm2.keySet());  //[1, 2, 3, 4]
        System.out.println(hm2.values());  //[Avengers, Avengers : Age of Ultron, Avengers : Infinity War, Avengers : Endgame]
        System.out.println(hm2.entrySet());  //[1=Avengers, 2=Avengers : Age of Ultron, 3=Avengers : Infinity War, 4=Avengers : Endgame]
    }
}
