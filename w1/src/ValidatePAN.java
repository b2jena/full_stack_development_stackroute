import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//validatePAN
public class ValidatePAN {
    /*
    * Write a java code to validate PAN Card of a person.
    * Function must return -1 if PAN Card is not Valid, else it will return true.
    * */

    public static void main(String[] args){
        System.out.println("CAUTION : CASE SENSITIVE");
        System.out.println("Enter PAN : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        if(s == null || s.isEmpty() || s.isBlank() || n != 10){
            //System.out.println("if");
            System.out.println(-1);
        }else{
            Scanner st = new Scanner(System.in);
            System.out.println("ENTER APPROACH :\n 1->regex\n 2->simple");
            int c = st.nextInt();
            switch (c){
                case 1:
                    /**
                     * regex approach
                     */
                    //System.out.println("else");
                    // Regex to check valid PAN Card number.
                    String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

                    // Compile the ReGex
                    Pattern p = Pattern.compile(regex);

                    // Pattern class contains matcher() method
                    // to find matching between given
                    // PAN Card number using regular expression.
                    Matcher m = p.matcher(s);

                    // Return if the PAN Card number
                    // matched the ReGex
                    if(m.matches()){
                        System.out.println(true);
                    }else{
                        System.out.println(-1);
                    }
                    break;
                case 2:
                    /**
                     * 2nd approach -> THIS IS IN THE ELSE PART
                     */
                    //count of characters [A-Z]
                    int cnt = 0;
                    for(int i=0; i<5;i++){
                        if((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90){
                            ++cnt;
                        }
                    }

                    boolean good = false;
                    //index 5 to 8 must contain [0-9] values
                    for(int i=5; i<=8; i++){
                        if(Character.isDigit(s.charAt(i))){
                            good = true;
                        }else{
                            good = false;
                        }
                    }
                    //last element should be [A-Z]
                    if((int)s.charAt(9) >= 65 && (int)s.charAt(9) <= 90){
                        good = true;
                    }else{
                        good = false;
                    }
                    if(cnt == 5 && good){
                        System.out.println(true);
                    }else{
                        System.out.println(-1);
                    }
                    break;
                default:
                    System.out.println("ENTER VALID INPUT");
            }
        }
    }
}
