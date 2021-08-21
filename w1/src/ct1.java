import java.util.Scanner;

public class ct1 {
    /*
    * Write a java code to find the sum of common elements present between two different Arrays.
    * If there are no common elements it must return 0 or
    * else if the array size is zero, it must return -1 else return sum of common elements. */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array1:");
        int s1 = sc.nextInt();
        System.out.println("Enter size of array2:");
        int s2 = sc.nextInt();

        //array input
        int[] arr1 = new int[s1];
        System.out.println("Enter elements of array1: ");
        for(int i=0;i<s1;i++){
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[s2];
        System.out.println("Enter elements of array2: ");
        for(int i=0;i<s2;i++){
            arr2[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
                if(arr1[i]==arr2[j]){
                    sum += arr1[i];
                }
            }
        }

        if(arr1.length==0 || arr2.length==0){
            System.out.println(-1);
        }else{
            System.out.println("Sum of common elements: " + sum);
        }
    }
}
