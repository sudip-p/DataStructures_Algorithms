package algorithms.sorting;
import algorithms.sorting.ArrayPrinter;

public class BubbleSort {

    /**
     * Driver method that calls a bubble sort method
     * @param args  Standard main method argument
     */
    public static void main(String[] args) {
        int[] data = {3,6,4,1,7,9,2,5,8,10};
        System.out.println("Unsorted array= " + ArrayPrinter.arrayToString(data));
        sort(data);
        System.out.println("Sorted array= " + ArrayPrinter.arrayToString(data));
    }

    /**
     * Method that performs bubble sort.
     * Algorithm: Keep swapping adjacent elements if they are in the wrong order, until the array is in right order
     * O(n^2) Complexity
     * @param arr   Array to be sorted
     */
    private static void sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    //swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
