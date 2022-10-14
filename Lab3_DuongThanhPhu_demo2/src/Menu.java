import java.util.ArrayList;
import java.util.Calendar;

public class Menu {
    static ArrayList<Candidates> candidatesList;
    static String menu = """
              WELCOME TO STUDENT MANAGEMENT \s
            1. ADD Epx                      \s
            2. ADD Fresher                  \s
            3. ADD Intern                   \s
            4. Search                       \s
            5. UpdateVsDelete               \s
            6. Printf                       \s""";
    static String menuUpdate = """
              WELCOME TO STUDENT MANAGEMENT ===This is Update Function \s
            1. Update FirstName             \s
            2. Update LastName              \s
            3. Update Phone                 \s
            4. Update Email                 \s  
            5. Update BirthDate             \s
            6. Update Type                  \s""";

    public static int printMenu() {
        System.out.println(menu);
        return Validation.inputInt("Enter your choice : ", 1, 7);
    }

    public static int printMenuUpdate() {
        System.out.println(menuUpdate);
        return Validation.inputInt("Choice 1 ==> 6 : ", 1, 6);
    }

}
