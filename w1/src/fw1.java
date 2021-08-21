import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class fw1 {
    public static int[] removeTheElement(int[] arr, int element) {
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null) {
            return null;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (arr[i] == element) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

    // Function to remove the element
    public static int[] removeTheIndex(int[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the case: \n 1. deletion based on index position \n 2. deletion based on element");
        int cas = sc.nextInt();
        switch(cas){
            case 1:
                System.out.println("Enter the index: ");
                int index = sc.nextInt();
                int [] arri = new int[n-1];
                arri = removeTheIndex(arr, index);
                //Arrays.sort(arr, Collections.reverseOrder());
                Arrays.sort(arri);
                for(int i=n-2;i>=0;i--){
                    System.out.print(arri[i] + " ");
                }
                //System.out.println(Arrays.toString(arri));
                break;
            case 2:
                System.out.println("Enter the element: ");
                int element = sc.nextInt();
                int[] arre = new int[n-1];
                arre = removeTheElement(arr, element);
                //Arrays.sort(arre, Collections.reverseOrder());
                Arrays.sort(arre);
                //now print it in descending order
                for(int i=n-2;i>=0;i--){
                    System.out.print(arre[i] + " ");
                }
                //System.out.println(Arrays.toString(arre));
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
