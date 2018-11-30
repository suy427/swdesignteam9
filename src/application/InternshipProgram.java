package application;

public class InternshipProgram {

    private int programID;
    private String programName;
    private String companyName;
    private String closingDate;// 이런것도 자료형을 따로 만들기 위한 class를 둬도 되는지 물어보고싶음
    private String position;
    private String workingContry;
    private String workingTerm; //얘도 마찬가지..
    private int wage;
    private int minimumYear;
    private String majorCondition; // 얘 이름 너무 부자연스러움..ㅠㅠ
    private float minimumGpa;
    private String englishName;
    private ExtraRequirement extraRequirement;

    public InternshipProgram() {

    }

    public void searchInternship() {

    }

    public boolean isClosed() {

        return false; // default value
    }

    public void apply() {

    }

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWorkingContry() {
        return workingContry;
    }

    public void setWorkingContry(String workingContry) {
        this.workingContry = workingContry;
    }

    public String getWorkingTerm() {
        return workingTerm;
    }

    public void setWorkingTerm(String workingTerm) {
        this.workingTerm = workingTerm;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getMinimumYear() {
        return minimumYear;
    }

    public void setMinimumYear(int minimumYear) {
        this.minimumYear = minimumYear;
    }

    public String getMajorCondition() {
        return majorCondition;
    }

    public void setMajorCondition(String majorCondition) {
        this.majorCondition = majorCondition;
    }

    public float getMinimumGpa() {
        return minimumGpa;
    }

    public void setMinimumGpa(float minimumGpa) {
        this.minimumGpa = minimumGpa;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public ExtraRequirement getExtraRequirement() {
        return extraRequirement;
    }

    public void setExtraRequirement(ExtraRequirement extraRequirement) {
        this.extraRequirement = extraRequirement;
    }
}
