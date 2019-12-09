import java.util.*;

public class collectionsTest {

    public static void main(String[] args) {
        Set<String> statesNeeded = new HashSet(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));
        Map<String, Set<String>> stations = new LinkedHashMap<>();

        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();
        Set<String> s3 = new HashSet<String>();

        s1 = stations.get("kone");
        s2 = stations.get("ktwo");
        s3.addAll(s1);
        s3.addAll(s2);

        for (String s : s3){
            System.out.print(s + " ");
        }
        System.out.println();

        for (Map.Entry<String, Set<String>> s: stations.entrySet() ){
            System.out.print(s.getKey() + " ");
        }

    }
}
