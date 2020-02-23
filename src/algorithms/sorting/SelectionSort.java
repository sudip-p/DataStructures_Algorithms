package algorithms.sorting;

public class SelectionSort {

    /**
     * Driver method to run selection sort algorithm
     * @param args  Standard main parameter
     */
    public static void main(String[] args) {

        int[] data = {5,3,6,2,7,1,10,9};
        System.out.print("Unsorted data = ");
        print(data);
        sort(data);
        System.out.print("Sorted data = ");
        print(data);

    }

    /**
     * Method that performs selection sort algorithm.
     * @param arr The array of integers which need to be sorted
     */
    private static void sort(int[] arr){
        /*
        Algorithm in a nutshell: Move the boundary of the unsorted elements
        one by one toward the end of the array
         */

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            //Find the min element in arr
            for(int j = i; j < arr.length - 1; j++){

                if(arr[j] < arr[min]){
                    min  = j;
                }
                swap(arr, min, i);
            }
        }


    }

    /**
     * Helper method to swap the position of two numbers in an array
     * @param data Array which contains the numbers
     * @param x First number to swap
     * @param y Second number to swap
     */
    private static void swap(int[] data, int x, int y){
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;

    }

    private static void print(int[] data){

        for(int i = 0; i < data.length; i++){
            if(i == 0){
                System.out.print("[");
            }
            if(i < data.length - 1){
                System.out.print(data[i] + ", ");
            }
            else{
                System.out.print(data[i] + "]\n");
            }
        }

    }

}


