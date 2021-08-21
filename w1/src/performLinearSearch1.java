
import java.util.Scanner;

public class performLinearSearch1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number that you want to search:");
        int x = sc.nextInt();
        int compareCount = 0;
        for (int i = 0; i < len; i++) {
            ++compareCount;
            if (arr[i] == x) {
                System.out.println("TOTAL NUMBER OF COMPARISONS : " + compareCount);
                System.out.println("POSITION OF "+ x +": " + i);
                break;
            }
        }
    }
}
