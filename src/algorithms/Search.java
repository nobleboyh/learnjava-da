package algorithms;

public class Search {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        int tmp = 1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = tmp;
            tmp++;
        }
        //Linear search
        long startTime = System.nanoTime();
        System.out.println("Linear search : " + linearSearch(arr, 66666));
        long endTime = System.nanoTime();
        System.out.println("Linear search cost: " + (endTime-startTime) + " ns");

        //Binary search
        startTime = System.nanoTime();
        System.out.println("Binary search : " + binarySearch(arr, 66666));
        endTime = System.nanoTime();
        System.out.println("Binary search cost: " + (endTime-startTime) + " ns");

        //Interpolation search
        startTime = System.nanoTime();
        System.out.println("Interpolation search : " + interpolationSearch(arr, 66666));
        endTime = System.nanoTime();
        System.out.println("Interpolation search cost: " + (endTime-startTime) + " ns");

    }

    /**
     * Linear search O(n)
     * @param arr: Input array
     * @param value: searched value
     * @return  index of value/ -1: Not found
     */
    public static int linearSearch(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if (arr[i]==value) return i;
        }
        return -1;
    }

    /**
     * Binary search O(log(n))
     * @param arr: Sorted array
     * @param value: searching value
     * @return: index of value
     */
    public static int binarySearch(int[] arr, int value){
        int start = 0, end = arr.length-1;  //-1: index start with 0
        while(start <= end){
            int mid = (start+end)/2;
            int midValue = arr[mid];
            if (value < midValue) end = mid -1;
            else if (value > midValue) start = mid+1;
            else return mid;
        }
        return -1;
    }

    /**
     * Interpolation: Special case of binary search
     * Used for uniform data
     * @param arr: sorted arr (uniformly recommended)
     * @param value: search value
     * @return  index of value
     */
    public static int interpolationSearch(int[] arr, int value){
        int start = 0, end = arr.length-1;
        while(start <= end && arr[start] <= value && arr[end] >= value){
            int ratio = (value - arr[start])/(arr[end]-arr[start]);
            int probe = start + (start-end)*ratio;
            int probeVal = arr[probe];

            if (probeVal < value) start = probe +1;
            else if (probeVal > value) end = probe - 1;
            else return probe;
        }
        return -1;
    }
}
