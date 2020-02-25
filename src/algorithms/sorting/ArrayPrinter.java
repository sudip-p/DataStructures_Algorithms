package algorithms.sorting;

class ArrayPrinter {

    /**
     * Method to return a string version of an array
     * @param arr   Array to be formatted into a string
     * @return  Returns the local string object createds
     */
    public static String arrayToString(int[] arr){
        StringBuilder s = new StringBuilder("");
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
