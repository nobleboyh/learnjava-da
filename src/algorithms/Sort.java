package algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {1, 100, 3, 2, 19 ,15};
        int[] arrMerge = mergeSort(arr);
        for (int i:arrMerge
             ) {
            System.out.println(i);
        }
    }

    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length-i; j++){
                if (arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length-1; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 2){
            return merge(new int[]{arr[0]}, new int[]{arr[1]});
        }else if (arr.length == 1){
            return merge(new int[]{arr[0]}, new int[0]);
        }else if (arr.length == 0){
            return new int[0];
        }
        int start = 0, end = arr.length;
        int mid = (end-start)/2;
        int[] arr1 = IntStream.range(0, arr.length).filter(i -> i < mid).map(i->arr[i]).toArray();
        int[] arr2 = IntStream.range(0, arr.length).filter(i -> i >= mid).map(i->arr[i]).toArray();
        arr1 =  mergeSort(arr1);
        arr2 = mergeSort(arr2);

        return merge(arr1, arr2);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        if (arr1.length < 1 ){
            return arr2;
        }else if (arr2.length < 1){
            return arr1;
        }
        int[] arr = new int[arr1.length + arr2.length];
        int tmp = 0;
        int runArr1 = 0, runArr2 = 0;
        boolean endArr1 = false, endArr2 = false;
        while (tmp < arr1.length + arr2.length){
            if((arr1[runArr1] < arr2[runArr2] && !endArr1) || endArr2){
                arr[tmp] = arr1[runArr1];
                if(runArr1 < arr1.length-1) runArr1++;
                else endArr1 = true;
            }else{
                arr[tmp] = arr2[runArr2];
                if(runArr2 < arr2.length-1) runArr2++;
                else endArr2 = true;
            }
            tmp++;
        }

        return arr;
    }

    public static void testSwap(int[] testArr){
        testArr[0] = 0;
        testArr[1] = 2;
    }
}
