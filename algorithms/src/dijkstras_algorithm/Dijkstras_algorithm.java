package dijkstras_algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dijkstras_algorithm {

    public static void main(String[] args){
        //граф
        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 6.0);
        graph.get("start").put("b", 2.0);
        graph.put("a", new HashMap<>());
        graph.get("a").put("end", 1.0);
        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 3.0);
        graph.get("b").put("end", 5.0);
        graph.put("end", new HashMap<>());

        //стоимости переходов
        HashMap<String, Double> costs = new HashMap<>();
        costs.put("a", 6.0);
        costs.put("b", 2.0);
        costs.put("end", Double.POSITIVE_INFINITY);

        //родители
        HashMap<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("end", null);

        System.out.println("Before:");
        System.out.println(graph);
        System.out.println(costs);
        System.out.println(parents);

        //проверенные узлы
        ArrayList<String> processed = new ArrayList<>();
        String node = findLowestCostNode(costs, processed);
        while (node !=null){
            Double cost = costs.get(node);
            HashMap<String, Double> neighbors = graph.get(node);
            for (String n : neighbors.keySet()){
                Double newCost = cost + neighbors.get(n);
                if (costs.get(n)>newCost){
                    costs.put(n, newCost);
                    parents.put(n, node);
                }
            }
            processed.add(node);
            node = findLowestCostNode(costs, processed);
        }

        System.out.println("After:");
        System.out.println(costs);
        System.out.println(parents);

        //перебор всех элементов Map
        /*for(Map.Entry<String, Integer> item : graph.get("start").entrySet()){
            System.out.println(item.getValue());
        }*/
    }

    private static String findLowestCostNode(HashMap<String,Double> costs, ArrayList<String> processed){
        Double lowestCost = Double.POSITIVE_INFINITY;
        String lowestCostNode = null;

        // Go through each node
        for (Map.Entry<String, Double> node : costs.entrySet()) {
            Double cost = node.getValue();
            // If it's the lowest cost so far and hasn't been processed yet...
            if (cost < lowestCost && !processed.contains(node.getKey())) {
                // ... set it as the new lowest-cost node.
                lowestCost = cost;
                lowestCostNode = node.getKey();
            }
        }
        return lowestCostNode;
    }
}
