package algorithms.sorting;

public class RecursiveBubbleSort {

    /**
     * Driver method that calls the function to bubblesort the array recursively
     * @param args Standard main method argument
     */
    public static void main(String[] args) {
        int[] data = {5,8,7,1,3,2,9,8,4,10,13,11};
        System.out.println("Unsorted data=" + ArrayPrinter.arrayToString(data));
        sort(data, data.length);
        System.out.println("Sorted data=" + ArrayPrinter.arrayToString(data));
    }

    /**
     * Method that performs bubble sort using a recursive function
     * Worst case: O(n^2)
     * Average case: O(n^2)
     * Best case: O(n)
     * @param arr Array to be sorted recursively
     */
    private static void sort(int[] arr, int n){

        //base case
        if(n == 1)
            return;

        for(int i = 0; i < n-1; i ++){

            if(arr[i] > arr[i + 1]){
                //swap both elements
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }//end if

        }//end for

        sort(arr, n-1);

    }
}
