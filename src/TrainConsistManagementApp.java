import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   UC2 - Add Passenger Bogies to Train");
        System.out.println("===========================================\n");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("B1");
        passengerBogies.add("B2");
        passengerBogies.add("B3");

        System.out.println("Bogies after addition: " + passengerBogies);

        String checkBogie = "B2";
        if (passengerBogies.contains(checkBogie)) {
            System.out.println(checkBogie + " is available in the train.");
        } else {
            System.out.println(checkBogie + " is NOT available.");
        }
        passengerBogies.set(1, "B2-Updated");
        System.out.println("After updating B2: " + passengerBogies);

        passengerBogies.remove("B1");
        System.out.println("After removing B1: " + passengerBogies);

        System.out.println("\nFinal Train Consist: " + passengerBogies);
    }
}