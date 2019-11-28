package selection_sort;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add((int) (Math.random()*99));
        }
        System.out.println(list);
        System.out.println(selectionSort(list));

    }

    public static List<Integer> selectionSort(List<Integer> list){
        List<Integer> newlist = new ArrayList<>();
        int size = list.size();
        for (int i=0; i<size;i++){
            int minimal = findMin(list);
            newlist.add(list.get(minimal));
            list.remove(minimal);
        }
        return newlist;
    }

    public static Integer findMin(List<Integer> list){
        int min = list.get(0);
        int minIndex = 0;
        for (int i=0; i<list.size();i++){
            if(list.get(i)<min){
                min = list.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }
}
