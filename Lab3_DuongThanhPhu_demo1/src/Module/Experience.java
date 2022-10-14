package Module;

public class Experience extends Candidates {
    private int yearExperience;
    private String professionallSkill;

    public Experience() {
        super();
    }




    public Experience(  int yearExperience  , String professionallSkill ,
                        String candidateID  , String firstName          , String lastName   , int birthDate,
                        String address      , String phone              , String email      , int typeCandidate) {
        super(candidateID, firstName, lastName, address, phone, email, birthDate, typeCandidate);
        this.yearExperience = yearExperience;
        this.professionallSkill = professionallSkill;
    }

    public int getYearExperience() {
        return yearExperience;
    }



    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getProfessionallSkill() {
        return professionallSkill;
    }

    public void setProfessionallSkill(String professionallSkill) {
        this.professionallSkill = professionallSkill;
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
