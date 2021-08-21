import java.util.Scanner;

public class largestDiff {
    public static void main(String[] args) {
        /**
         *  Write a program to read a integer array,
         *  find the largest difference between adjacent elements and display the index of largest difference.
         *  EXAMPLE:input1: {2,4,5,1,9,3,8} , output1: 4 (here largest difference 9-1=8 then return index of 9 ie,4)
         */
        System.out.println("Enter the length of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //largest difference
        int maxdiff = 0;
        int idx = 0;
        for(int i=1; i<n; i++){
            if(Math.abs(arr[i]-arr[i-1]) > maxdiff){
                maxdiff = Math.abs(arr[i]-arr[i-1]);
                idx = i;
            }
        }
        System.out.println("largest difference : " + maxdiff);
        System.out.println("Index : " + idx);
    }
}
