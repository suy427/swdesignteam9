package application;

import java.util.ArrayList;
import java.util.Date;

public class InternshipProgram {

    private int officeID;
    private String officeName;
    private int programID;
    private String programName;
    private String companyName;
    private Date closingDate;
    private String position;
    private String workingContry;
    private Period workingPeriod;
    private int wage;
    private int minYear;
    private String majorCondition; // 얘 이름 너무 부자연스러움..ㅠㅠ
    private float minGpa;
    private String englishLevel;
    private ExtraRequirement extraRequirement;

    public InternshipProgram() {

    }

    public void apply(int stdID) {
        Apply.getInstance(this.programID, stdID);
    }

    public void searchInternship() {

    }

    public boolean isClosed() {

        return false; // default value
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

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public Period getWorkingPeriod() {
        return workingPeriod;
    }

    public void setWorkingPeriod(Period workingPeriod) {
        this.workingPeriod = workingPeriod;
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

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public ExtraRequirement getExtraRequirement() {
        return extraRequirement;
    }

    public void setExtraRequirement(ExtraRequirement extraRequirement) {
        this.extraRequirement = extraRequirement;
    }
}
