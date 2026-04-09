import java.util.LinkedList;
import java.util.List;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   UC4 - Maintain Ordered Bogie Consist");
        System.out.println("===========================================\n");

        List<String> trainConsist = new LinkedList<>();

        addBogie(trainConsist, "B1");
        addBogie(trainConsist, "B2");
        addBogie(trainConsist, "B3");

        addBogie(trainConsist, "B2");

        System.out.println("After adding bogies: " + trainConsist);

        String newBogie = "B1.5";
        if (!trainConsist.contains(newBogie)) {
            trainConsist.add(1, newBogie);
        }
        System.out.println("After inserting at position 1: " + trainConsist);

        if (!trainConsist.isEmpty()) {
            trainConsist.remove(0);
        }

        if (!trainConsist.isEmpty()) {
            trainConsist.remove(trainConsist.size() - 1); // rear
        }

        System.out.println("After removing front & rear: " + trainConsist);

        System.out.println("\nFinal Train Consist: " + trainConsist);
    }
    public static void addBogie(List<String> list, String bogie) {
        if (!list.contains(bogie)) {
            list.add(bogie);
        } else {
            System.out.println("Duplicate bogie " + bogie + " not added.");
        }
    }
}