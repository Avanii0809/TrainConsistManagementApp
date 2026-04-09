import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===========================================\n");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("B101");
        formation.add("B102");
        formation.add("B103");
        formation.add("B104");

        formation.add("B102");
        formation.add("B103");

        System.out.println("Train Formation (Insertion Order Preserved):");
        for (String bogie : formation) {
            System.out.println(bogie);
        }

        System.out.println("\nTotal unique bogies: " + formation.size());
    }
}