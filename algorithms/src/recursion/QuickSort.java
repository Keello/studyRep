package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args){
        List <Integer> arr = new ArrayList<>();
        int size = (int) (Math.random()*5+2);
        for (int i=0; i<size;i++){
            arr.add((int) (Math.random()*50));
        }
        System.out.println(arr);
        quickSort(arr);
        System.out.println(arr);
    }

    public static List<Integer> quickSort(List<Integer> arr){
        if (arr.size()<2){
            return arr;
        }
        else {
            int based = 1;
            List <Integer> lessArr = new LinkedList<>();
            List <Integer> moreArr = new LinkedList<>();

            for(int i=0;i<arr.size();i++){
                if (i == based) continue;
                if (arr.get(i)<=arr.get(based)){
                    lessArr.add(arr.get(i));
                }
                if (arr.get(i)>arr.get(based)){
                    moreArr.add(arr.get(i));
                }
            }
            based = arr.get(based);
            arr.clear();
            arr.addAll(quickSort(lessArr));
            arr.add(based);
            arr.addAll(quickSort(moreArr));

        }
        return arr;
    }
}
