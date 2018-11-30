package application;

import java.util.Date;

public class InternshipProgram {

    private int programID;
    private String programName;
    private String companyName;
    private Date closingDate;
    //private String closingDate;
    private String position;
    private String workingContry;
    private Date workingTerm;
    //private String workingTerm; //얘도 마찬가지..
    private int wage;
    private int minYear;
    private String majorCondition; // 얘 이름 너무 부자연스러움..ㅠㅠ
    private float minGpa;
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

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
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

    public Date getWorkingTerm() {
        return workingTerm;
    }

    public void setWorkingTerm(Date workingTerm) {
        this.workingTerm = workingTerm;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getMinYear() {
        return minYear;
    }

    public void setMinYear(int minYear) {
        this.minYear = minYear;
    }

    public String getMajorCondition() {
        return majorCondition;
    }

    public void setMajorCondition(String majorCondition) {
        this.majorCondition = majorCondition;
    }

    public float getMinGpa() {
        return minGpa;
    }

    public void setMinGpa(float minGpa) {
        this.minGpa = minGpa;
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
