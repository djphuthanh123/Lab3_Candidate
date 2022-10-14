import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Validation {

    private final static Scanner sc = new Scanner(System.in);
    protected static final String PHONE_VALID
            = "^(0[3|5|7|8|9])+([0-9]{8})$";

    protected static final String EMAIL_VALID
            = "[A-Za-z]\\w+@\\w+(\\.\\w+)$";
    protected static final String NAME
            = "[A-Za-z0-9\\s]+";

    public static int inputInt(String mess, int min, int max) {
        System.out.print(mess);
        while(true) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an integer number ");
            }
        }
    }



    public static String inputString(String string,String regex) {
        System.out.print(string);
        while(true) {
            String input = sc.nextLine();
            if(!input.matches(regex)){
                System.out.println("Plz input  followed the regex: "+regex);
                continue;
            }
            if (input.equals(" ")) {
                System.out.print("Plz input a non-empty string: ");
                continue;
            }
            return input;
        }
    }
    public static String inputDate(String string) {
        System.out.print(string);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        while(true) {
            String input = sc.nextLine();
            try {
                Date date = dateFormat.parse(input);
                Date curDate = Calendar.getInstance().getTime();
                if (curDate.compareTo(date) < 0) {
                    System.out.println("Plz input date that before current date: ");
                    continue;
                }
                dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(date);
            } catch (Exception e) {
                System.out.print("Plz input valid date (dd/MM/yyyy): ");
            }
        }
    }
    public static boolean checkInputYN() {
        while (true) {
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    public static int inputSelect(String mess, int min, int max) {
        System.out.print(mess);
        while(true) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an integer number: ");
            }
        }
    }
    public static String checkInputGraduationRank() {
        while (true) {
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.err.println("Please input string: Excellence, Good, Fair, Poor");
                System.out.print("Enter again: ");
            }
        }
    }
    public static boolean checkIdExist(ArrayList<Candidates> candidatesList, String id) {
        for (Candidates ct: candidatesList) {
            if (ct.getCandidateID().equalsIgnoreCase(id)) {
                System.err.println("Id exist.");
                return false;
            }
        }
        return true;
    }


}
