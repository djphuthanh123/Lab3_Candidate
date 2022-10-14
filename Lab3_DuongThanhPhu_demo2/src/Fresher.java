public class Fresher extends Candidates{
    private String graduationDate,graduationRank;

    public Fresher() {
        super();
    }



    public Fresher( String graduationDate   , String graduationRank ,
                    String candidateID      , String firstName      , String lastName ,
                    int birthDate           , String address        , String phone    ,
                    String email            , int typeCandidate
                     ) {
        super(candidateID, firstName, lastName, address, phone, email, birthDate, typeCandidate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }
    @Override
    public String showCandidate() {
        return String.format("ID: "              +this.getCandidateID()
                            +"First Name:  "     +this.getFirstName()
                            +"Last  Name:  "     +this.getLastName()
                            +"Date Of birth: "   +this.getBirthDate()
                            +"Type:  "           +this.getTypeCandidate()
        );
    }
}
