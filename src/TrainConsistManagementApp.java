import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("======================================\n");

        Map<String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("B1", 72);
        capacityMap.put("B2", 68);
        capacityMap.put("B3", 80);
        capacityMap.put("B4", 75);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " -> Capacity: " + entry.getValue());
        }
    }
}