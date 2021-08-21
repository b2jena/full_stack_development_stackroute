import java.util.Arrays;
import java.util.Scanner;

public class performBinSearch1 {
    // Returns index of x if it is present in arr[],
    // else return -1
    public int binarySearch(int arr[], int x)
    {
        //l->left, r->right, m->mid
        int l = 0, r = arr.length - 1;
        int compareCount = 0;  //we are suppose to print the total number of comparisons
        while (l <= r) {

            int m = l + (r - l) / 2;  //to avoid ArrayIndexOutOfBoundException
            //m will return the index of first occurence of x

            int midVal = arr[m];
            ++compareCount;

            if (midVal < x)
                l = m + 1;
            else if (midVal > x)
                r = m - 1;
            else if (l != m) //Equal but range is not fully scanned
                r = m; //Set upper bound to current number and rescan
            else { //Equal and full range is scanned
                System.out.println("TOTAL NUMBER OF COMPARISONS : "+compareCount);
                return m;
            }
            /*
            this code will not return the first occurence of x....it will return the index of x
            // Check if x is present at mid
            if (arr[m] == x) {
                System.out.println("TOTAL NUMBER OF COMPARISONS : "+compareCount);
                return m;
            }

            // If x greater, ignore left half
            else if (arr[m] < x) {
                l = m + 1;
            }
            // If x is smaller, ignore right half
            else{
                r = m - 1;
            }
            */
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);  //in binary search, we only use sorted arrays

        System.out.println("Enter the element that you want to search:");

        int x = sc.nextInt();

        performBinSearch1 ob = new performBinSearch1();

        int firstOccurence = ob.binarySearch(arr, x);
        if(firstOccurence == -1){
            System.out.println("UNABLE TO FIND " + x);
        }else{
            System.out.println("POSITION OF "+ x +": " + firstOccurence);
        }
    }
}
