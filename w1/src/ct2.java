import java.util.Scanner;

public class ct2 {
    /*Write a java program to find the number of vowels in a string.
    It must return -1 when there are no vowels in the string or else it must return vowel count.
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        s = s.toLowerCase();
        //System.out.println(s);  //for debugging
        int cnt = 0;
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u'){
                ++cnt;
            }
        }
        if(cnt == 0){
            //vowel not found
            System.out.println(-1);
        }else{
            System.out.println("Number of vowel(s) is(are) : " + cnt);
        }
    }
}
