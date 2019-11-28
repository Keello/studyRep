package recursion;

import java.util.Arrays;

public class Recursion {

        public static void main(String[] args) {

            int[] arr = new int[(int) (Math.random()*10+5)];
            for (int i=0; i<arr.length; i++){
                arr[i] = (int) (Math.random()*100);
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("Size:" + recursCount(arr));

            int max = max(new int[]{1, 5, 10, 25, 16, 1});
            System.out.println(max);
        }


        private static int recursCount(int[] arr){
            if (arr.length ==0){
                return 0;
            }

            return 1 + recursCount(Arrays.copyOfRange(arr, 1, arr.length));
        }

        private static int max(int[] list) {
            if (list.length == 2) {
                return list[0] > list[1] ? list[0] : list[1];
            }
            int subMax = max(Arrays.copyOfRange(list, 1, list.length));
            return list[0] > subMax ? list[0] : subMax;
        }

}
