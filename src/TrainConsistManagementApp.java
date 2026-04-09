import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   UC3 - Track Unique Bogie IDs");
        System.out.println("===========================================\n");

        Set<String> bogies = new HashSet<>();

        bogies.add("B6101");
        bogies.add("B6102");
        bogies.add("B6103");
        bogies.add("B6104");

        bogies.add("B6101");
        bogies.add("B6102");

        System.out.println("Unique Bogie IDs:");
        for (String bogie : bogies) {
            System.out.println(bogie);
        }

        System.out.println("\nTotal unique bogies: " + bogies.size());
    }
}