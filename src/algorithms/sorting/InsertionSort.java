package algorithms.sorting;

public class InsertionSort {

    /**
     * Main method to call the sort() method, which performs insertion sort. The data structure (array) to do insertion
     * sort is also declared in this method
     * @param args Standard main arguments
     */
    public static void main(String[] args) {
        int[] data  = {5,3,7,8,3,2,1,10,13,11};
        System.out.println("Unsorted data = " + ArrayPrinter.arrayToString(data));
        sort(data);
        System.out.println("Sorted data = " + ArrayPrinter.arrayToString(data));

    }

    /**
     * Insertion sort takes an element from array index i = 1 to i = n-1 and insert it to the sorted sequence arr[0] to
     * arr[i-1]
     * @param arr   The array to be sorted
     */
    private static void sort(int[] arr){

        int n = arr.length; //array length
        int i,j,item;       //variables used to iterate (i,j) the array and find the smallest item to put into
                            // sorted list, and item is used as an int buffer.
        for (i = 0; i <= n - 1; i++) {
            item = arr[i];
            j = i;
            while(j > 0 && arr[j-1] > item){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = item;
        }
    }



}
