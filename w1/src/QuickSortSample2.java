import java.util.Scanner;

public class QuickSortSample2 {
    /*
    This function takes last element as pivot, places
    the pivot element at its correct position in sorted
    array, and places all smaller (smaller than pivot)
    to left of pivot and all greater elements to right
    of pivot
    */
    static int partition(int[] arr, int low, int high)
    {

        // pivot -> keeping it low
        int pivot = arr[low];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low + 1);

        for(int j = low ; j <= high ; j++)
        {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {
                //swap -> arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Increment index of
                // smaller element
                i++;
            }
        }
        //swap -> arr[i-1] and arr[low]
        int temp = arr[i-1];
        arr[i-1] = arr[low];
        arr[low] = temp;

        return (i - 1);
    }

    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);  //recursive call 1
            quickSort(arr, pi + 1, high);  //recursive call 2
        }
    }


    // main driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements for the array one by one:");
        for(int i = 0;i < n; i++)
            arr[i] = sc.nextInt();

        //function call
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array using quick sort: ");

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        //we can also try Arrays.sort(arrayName)
    }
}
