

public class MyMain
{
    public static void main(String[] args)
    {
        CandidateMng cd = new CandidateMng();
        cd.generationCandidate();
        while (true)
        {
            int choice = Menu.printMenu();
            switch (choice)
            {
                case 1 -> cd.createCandidate(0);
                case 2 -> cd.createCandidate(1);
                case 3 -> cd.createCandidate(2);
                case 4 -> cd.searchCandidate();
                case 5 -> cd.update();
                case 6 -> cd.printListNameCandidate();
                case 7 -> cd.DeleteCandidates();
            }
        }
    }
}
