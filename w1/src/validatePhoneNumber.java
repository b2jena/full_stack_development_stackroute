import java.util.Scanner;
public class validatePhoneNumber {
    /*
    * Given a phone number as a string input, write a program to verify
    * whether the phone number is valid using the following business rules:-
    * It should contain only numbers or dashes (-),
    * -dashes may appear at any position,Should have exactly 10 digits*/
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        validatePhoneNumber object = new validatePhoneNumber();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }

    public String getInput() {
        System.out.println("Enter Phone Number : ");
        String s = sc.nextLine();
        //validatePhoneNumber(s);
        return s;
        //return null;
    }

    public void displayResult(boolean result) {
        //System.out.println(result);
        if(result){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid or empty string");
        }
    }

    public boolean validatePhoneNumber(String s) {
        try {
            //System.out.println(s);
            //digit count should be 10
            int cnt = 0;
            s = s.replaceAll("-", "");
            if (s.isEmpty()) {
                //System.out.println(s);
                return false;
            }
            //String str = s.trim();
            //System.out.println(s);
            //System.out.println(s.length());
            for (int i = 0; i < s.length(); i++) {
                //int j = (int)s.charAt(i);
                //System.out.println(j);
                if (Character.isDigit(s.charAt(i))) {
                    ++cnt;
                }
            }
            //System.out.println(cnt);
            if (cnt != 10) {
                //System.out.println(cnt);
                return false;
            }
            //s must contain -(s) and [0,9] numbers
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    //System.out.println("here : " + s.charAt(i));
                    return false;
                }
            }
            return true;
        }
        catch(NullPointerException e){
            return false;
        }
    }
}
