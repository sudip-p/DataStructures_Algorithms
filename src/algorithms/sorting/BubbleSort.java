package algorithms.sorting;

public class BubbleSort {

    /**
     * Driver method that calls a bubble sort method
     * @param args  Standard main method argument
     */
    public static void main(String[] args) {
        int[] data = {3,6,4,1,7,9,2,5,8,10};
        System.out.println("Unsorted array= " + arrayToString(data));
        sort(data);
        System.out.println("Sorted array= " + arrayToString(data));
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

    /**
     * Method to return a string version of an array
     * @param arr   Array to be formatted into a string
     * @return  Returns the local string object createds
     */
    private static String arrayToString(int[] arr){
        StringBuffer s = new StringBuffer("");
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if(i == 0){
                s.append("[");
            }
            else if(i < n-1){
                s.append(arr[i] + ", ");
            }
            else{
                s.append(arr[i] + "]");
            }

        }

        return s.toString();
    }
}
