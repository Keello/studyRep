package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int[] arr = {32, 39, 21, 45, 23, 3};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        System.out.println("before: " + Arrays.toString(arr));
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}