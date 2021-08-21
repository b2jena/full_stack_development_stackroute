import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        /**
         * HashMap demo
         * key value pairs
         */
        HashMap<String,String> capitalCities = new HashMap<String,String>();
        capitalCities.put("India","New Delhi");
        capitalCities.put("United States of America","Washington DC");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Bangladesh","Dhaka");
        for(String s : capitalCities.keySet()){
            System.out.println(s);
        }
        System.out.println(capitalCities);
    }
}
