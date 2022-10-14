package Controller;

import Module.*;


import java.util.ArrayList;
import java.util.Calendar;

public class CandidateMng {
    
    static ArrayList<Candidates> candidatesList = new ArrayList<>();



    public void createCandidate(int type) {
        while (true) {
            String id;
            while (true) {
                id = Validation.inputString("Enter ID:", Validation.NAME);
                if (Validation.checkIdExist(candidatesList, id)) {
                    break;
                } else {
                    System.out.println("ID is existed");
                }
            }
            String firstName = Validation.inputString("Enter first name:", Validation.NAME);
            String lastName = Validation.inputString("Enter last name:", Validation.NAME);
            int birthDate = Validation.inputInt("Enter birthdate:", 1900, Calendar.getInstance().get(Calendar.YEAR));
            String address = Validation.inputString("Enter address", ".*");
            String phone = Validation.inputString("Enter phone:", Validation.PHONE_VALID);
            String email = Validation.inputString("Enter email:", Validation.EMAIL_VALID);
            switch (type) {
                case 0 -> {
                    int yearExperience = Validation.inputInt("Enter year of experience:", 0, 100);
                    String professionalSkill = Validation.inputString("Enter professional skill:", ".+"); //
                    candidatesList.add(new Experience(yearExperience, professionalSkill, id, firstName, lastName, birthDate, address, phone, email, type));
                }
                case 1 -> {
                    String graduationDate = Validation.inputDate("Enter graduation date:");
                    System.out.print("Enter graduation rank: ");
                    String graduationRank = Validation.checkInputGraduationRank();
                    candidatesList.add(new Fresher(graduationDate, graduationRank, id, firstName, lastName, birthDate, address, phone, email, type));
                }
                case 2 -> {
                    String major = Validation.inputString("Enter major:", ".+");
                    String semester = Validation.inputString("Enter major:", ".+");
                    String university = Validation.inputString("Enter university:", ".+");
                    candidatesList.add(new Intern(major, semester, university, id, firstName, lastName, birthDate, address, phone, email, type));
                }
            }
            System.out.print("Do you want to continue (Y/N): ");
            if (!Validation.checkInputYN()) return;

        }
    }

    public void printListNameCandidate() {
        StringBuilder experience = new StringBuilder();
        StringBuilder fresher = new StringBuilder();
        StringBuilder intern = new StringBuilder();
        for (Candidates candidates : candidatesList) {
            if (candidates instanceof Experience) {
                experience.append("ID: ").append(candidates.getCandidateID()).append(" ").append("Full Name: ").append(candidates.getFirstName()).append(" ").append(candidates.getLastName()).append(" ").append(" Type :").append(candidates.getTypeCandidate()).append("\n");
            }
            if (candidates instanceof Fresher) {

                fresher.append("ID: ").append(candidates.getCandidateID()).append(" ").append("Full Name: ").append(candidates.getFirstName()).append(" ").append(candidates.getLastName()).append(" ").append(" Type :").append(candidates.getTypeCandidate()).append("\n");
            }
            if (candidates instanceof Intern) {
                intern.append("ID: ").append(candidates.getCandidateID()).append(" ").append("Full Name: ").append(candidates.getFirstName()).append(" ").append(candidates.getLastName()).append(" ").append(" Type :").append(candidates.getTypeCandidate()).append("\n");
            }
        }
        System.out.println("===========EXPERIENCE CANDIDATE============\n" + experience);
        System.out.println("==========FRESHER CANDIDATE==============\n" + fresher);
        System.out.println("===========INTERN CANDIDATE==============\n" + intern);
    }

    public void searchCandidate() {
        printListNameCandidate();
        int typeCandidate = Validation.inputInt("Enter type of candidate  (0 is Exp, 1 is fresher,2 is intern)", 0, 2);
        String nameSearch = Validation.inputString("Enter candidate name (First name or Last name): ", ".+");

        int count = 0;
        for (Candidates candidate : candidatesList) {
            if (candidate.getTypeCandidate() == typeCandidate && (candidate.getFirstName().equalsIgnoreCase(nameSearch) || candidate.getLastName().equalsIgnoreCase(nameSearch))) {
                System.out.println("ID: " + candidate.getCandidateID() + " First Name : " + candidate.getFirstName() + " Last Name : " + candidate.getLastName() + " Type : " + candidate.getTypeCandidate());
                count++;
            }
        }
        if (count == 0) System.out.println("not found");


    }

    public static ArrayList<Candidates> getListStudentByType(int type){
        ArrayList<Candidates > listOfTypeCandidate = new ArrayList<>();
        for (Candidates st : candidatesList) {
            if (st.getTypeCandidate() == type ){
                listOfTypeCandidate.add(st);
            }
        }
        return listOfTypeCandidate;
    }

    public void update() {
        int type = Validation.inputInt("Select Type do u want Update (0==>Exp,1==>fresher,2==>intern):", 0, 2);
        ArrayList<Candidates> listStudentFindBytype = getListStudentByType(type);
        if (listStudentFindBytype.isEmpty()) {
            System.out.println("Not found !");
        } else {
                switch (type) {
                    case 0 -> ProcessUpdate.switchUpdateEpx( 0);
                    case 1 -> ProcessUpdate.switchUpdateFresher(1);
                    case 2 -> ProcessUpdate.switchUpdateIntern( 2);
                }
        }
    }
    
    public void DeleteCandidates(){
        ProcessDelete.delete(candidatesList);
    }




    public void generationCandidate() {
        candidatesList.add(new Intern("SE", "", "FPT University", "1", "phu", "duong", 2002, "Quang Nam", "0974421442", "phuduong123@gmail.com", 2));
        candidatesList.add(new Intern("SE", "", "Back khoa University", "56", "phu", "pham", 1995, "Da Lat", "0903454221", "phupham567@gmail.com", 2));
        candidatesList.add(new Experience(10, "Back-end", "2", "hoang", "anh", 2000, "Da Nang", "0912234234", "hoanganh98@gmail.com", 0));
        candidatesList.add(new Experience(10, "Font-end", "45", "nguyen", "le", 1999, "Da Nang", "0905563888", "nnnl1999@gmail.com", 0));
        candidatesList.add(new Experience(10, "Back-end", "34", "nguyen", "tuan", 1994, "Da Nang", "0913444909", "nguyentuan94@gmail.com", 0));
        candidatesList.add(new Fresher("2022", "Good", "24", "tran", "minh", 2001, "Ha Noi", "0712564568", "minhtran@outlook.com", 1));
        candidatesList.add(new Fresher("2021", "Good", "548", "ngo", "hien", 1999, "Vung Tau", "0326312222", "ngominhhien12@yahoo.com", 1));
    }

}
