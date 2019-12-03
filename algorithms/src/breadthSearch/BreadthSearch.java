package breadthSearch;

import java.util.*;

public class BreadthSearch {

    public static void main(String[] args){
        HashMap<String, List<String>> graph = new HashMap<>();
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("tom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("tom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        search(graph,"you");
    }

    private static boolean search(HashMap<String, List<String>> graph, String name){
        Queue<String> queue = new ArrayDeque<>(graph.get(name));
        Set<String> searched = new LinkedHashSet<>();
        while (!queue.isEmpty()){
            String person = queue.poll();
            if (!searched.contains(person)){
                if (isSeller(person)){
                    System.out.println(person + " is seller");
                    return true;
                }
                else {
                    queue.addAll(graph.get(person));
                    searched.add(person);
                }
            }
        }
        System.out.println("Seller not found");
        return false;
    }

    private static boolean isSeller(String name){
        if (name.endsWith("m")){
            return true;
        }
        else return false;
    }
}
