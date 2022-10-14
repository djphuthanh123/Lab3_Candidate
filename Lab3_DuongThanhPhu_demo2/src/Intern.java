public class Intern extends Candidates{
    private String major,semester,university;

    public Intern() {
        super();
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

    public Intern(  String major        ,String semester    ,String university  ,
                    String candidateID  , String firstName  , String lastName   ,int birthDate,
                    String address      , String phone      , String email      , int typeCandidate) {
        super(candidateID, firstName, lastName, address, phone, email, birthDate, typeCandidate);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
