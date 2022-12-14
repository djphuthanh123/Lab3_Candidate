package Controller;
import Module.Candidates;

import java.util.ArrayList;

public class ProcessDelete {

    public static int findIndex(ArrayList<Candidates> candidatesList, String id) {
        for (Candidates ct : candidatesList) {
            if (ct.getCandidateID().equalsIgnoreCase(id)) {
                return candidatesList.indexOf(ct);
            }

        }
        return -1;
    }

    public static void delete(ArrayList<Candidates> candidatesList) {
        while (true){
            if (candidatesList.isEmpty()) {
                System.out.println(" Empty Candidates ");
            } else {
                System.out.println("Delete function : ");
                String id = Validation.inputString("Select ID You want Delete : ", ".+");
                int index = findIndex(candidatesList, id);
                if (index == -1)
                    break;
                candidatesList.remove(index);
                break;
            }
        }
    }
}
