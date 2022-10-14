

import java.util.ArrayList;
import java.util.Calendar;

public class ProcessUpdate {


    public static Candidates getCandidatesByListFound(ArrayList<Candidates> listCandidateFindByType) {
        System.out.println("List Candidate found: ");
        int count = 0;
        for (Candidates cd : listCandidateFindByType) {
            System.out.println("Index: " + (count++) + "| " + cd.getCandidateID() + " " + cd.getFirstName() + " " + cd.getLastName()+" "+ cd.getTypeCandidate());
        }
        int index = Validation.inputSelect("Enter index:", 0, listCandidateFindByType.size() - 1);
        return listCandidateFindByType.get(index);
    }

    public static void switchUpdateEpx( int type){
        ArrayList<Candidates> listStudentFindByID = CandidateMng.getListStudentByType(type);
        Candidates st = getCandidatesByListFound(listStudentFindByID);
        int choice = Menu.printMenuUpdate();
        switch (choice) {
            case 1 -> {
                for (Candidates st1 :listStudentFindByID ) {
                    if (st1 instanceof Experience )
                        st1.setFirstName(Validation.inputString("Set First Name",Validation.NAME));
                    break;
                }
            }
            case 2 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Experience )
                        st1.setLastName(Validation.inputString("Set LastName", Validation.NAME));
                    break;
                }
            }
            case 3 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Experience )
                        st1.setPhone(Validation.inputString("Set Phone", Validation.PHONE_VALID));
                    break;
                }
            }
            case 4 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Experience )
                        st1.setEmail(Validation.inputString("Set Email", Validation.EMAIL_VALID));
                    break;
                }
            }
            case 5 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Experience )
                        st1.setBirthDate(Validation.inputInt("Set BirthDate", 1990, Calendar.getInstance().get(Calendar.YEAR)));
                    break;
                }
            }
            case 6 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Experience )
                        st1.setTypeCandidate(Validation.inputInt("Set type", 0, 1));
                    break;
                }
            }
            default -> System.out.println("Dinh virus roi !");
        }

    }
    public static void switchUpdateFresher( int type){
        ArrayList<Candidates> listStudentFindByID = CandidateMng.getListStudentByType(type);
        Candidates st = getCandidatesByListFound(listStudentFindByID);
        int choice = Menu.printMenuUpdate();
        switch (choice) {
            case 1 -> {
                for (Candidates st1 :listStudentFindByID ) {
                    if (st1 instanceof Fresher )
                        st1.setFirstName(Validation.inputString("Set First Name",Validation.NAME));
                    break;
                }
            }
            case 2 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Fresher )
                        st1.setLastName(Validation.inputString("Set LastName", Validation.NAME));
                    break;
                }
            }
            case 3 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Fresher )
                        st1.setPhone(Validation.inputString("Set Phone", Validation.PHONE_VALID));
                    break;
                }
            }
            case 4 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Fresher )
                        st1.setEmail(Validation.inputString("Set Email", Validation.EMAIL_VALID));
                    break;
                }
            }
            case 5 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Fresher )
                        st1.setBirthDate(Validation.inputInt("Set BirthDate", 1990, Calendar.getInstance().get(Calendar.YEAR)));
                    break;
                }
            }
            case 6 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Fresher )
                        st1.setTypeCandidate(Validation.inputInt("Set type", 0, 1));
                    break;
                }
            }
            default -> System.out.println("Dinh virus roi !");
        }

    }
    public static void switchUpdateIntern( int type){
        ArrayList<Candidates> listStudentFindByID = CandidateMng.getListStudentByType(type);
        Candidates st = getCandidatesByListFound(listStudentFindByID);
        int choice = Menu.printMenuUpdate();
        switch (choice) {
            case 1 -> {
                for (Candidates st1 :listStudentFindByID ) {
                    if (st1 instanceof Intern )
                        st1.setFirstName(Validation.inputString("Set First Name",Validation.NAME));
                    break;
                }
            }
            case 2 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Intern )
                        st1.setLastName(Validation.inputString("Set LastName", Validation.NAME));
                    break;
                }
            }
            case 3 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Intern )
                        st1.setPhone(Validation.inputString("Set Phone", Validation.PHONE_VALID));
                    break;
                }
            }
            case 4 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Intern )
                        st1.setEmail(Validation.inputString("Set Email", Validation.EMAIL_VALID));
                    break;
                }
            }
            case 5 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Intern )
                        st1.setBirthDate(Validation.inputInt("Set BirthDate", 1990, Calendar.getInstance().get(Calendar.YEAR)));
                    break;
                }
            }
            case 6 -> {
                for (Candidates st1 : listStudentFindByID) {
                    if (st1 instanceof Intern )
                        st1.setTypeCandidate(Validation.inputInt("Set type", 0, 1));
                    break;
                }
            }
            default -> System.out.println("Dinh virus roi !");
        }

    }



}
