package binary_search;

public class Main {

    public static void main(String[] args){
    int[] list = new int[100];
    for (int i=0; i<list.length;i++){
        list[i] = (i+1);
    }
        System.out.println(serching(list, 2)); // 1
        System.out.println(serching(list, 0)); // null


    }
    public static Integer serching(int[] list, int item){
        int low = 0;
        int high = list.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}
