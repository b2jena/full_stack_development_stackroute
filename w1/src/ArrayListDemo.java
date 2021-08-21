import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        /**
         * Write a program that accepts an ArrayList of integers as input and removes every 3rd element
         * and prints the final ArrayList.
         */

        /**
         * with length input
         */
        List<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER LENGTH (more than 3) OF ARRAYLIST : ");
        int n = sc.nextInt();
        System.out.println("Enter elements (more than 3) into the arraylist : ");
        for(int i=0; i<n; i++){
            int in = sc.nextInt();
            arrayList.add(in);
        }

        for(int i = 2; i < n-2 ; i += 2){
            arrayList.remove(i);  //remove every 3rd element
        }

        System.out.println(arrayList);

        /**
         * without the length input
         */
        System.out.println("Enter arraylist elements : ");
        ArrayList<Integer> clonearrayList = new ArrayList<>();
        while(true){
            int in = sc.nextInt();

            if(in == 0) {   //if you press 0 then enter, we will exit this while loop
                //ascii value of \n is 10
                //ascii value of null is 0
                break;
            }
            clonearrayList.add(in);
        }
        int t = 2;
        while(t < clonearrayList.size()){
            clonearrayList.remove(t);
            t += 2;
        }
        System.out.println(clonearrayList);
    }
}
