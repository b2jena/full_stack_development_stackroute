import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.*;

public class RegularExpressionPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string :");
        String s = sc.nextLine();
        String regex = "[a-z]{5}[@]{1}[a-z]{5}[.]{1}[a-z]{3}";
        /**
         * pattern and matcher
         */
        Pattern p = Pattern.compile(regex);
        System.out.println(p);  // regex string
        Matcher m = p.matcher(s);

        System.out.println(m.matches());  //true or false

        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] clonearr = arr.clone();
        Collections.reverse(Arrays.asList(arr));

        System.out.println(Arrays.toString(arr));  //[5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(clonearr));  //[1, 2, 3, 4, 5]
    }
}
