package application;

import java.util.Date;

public class ProgramInformation {

    private int officeID;
    private String officeName;
    private int programID;
    private String programName;
    private String companyName;
    private Date closingDate;
    private boolean position;
    private String workingCountry;
    private Period workingPeriod;
    private int wage;
    private int numberOfPeople;
    private ProgramRequirement programRequirement;

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

    public boolean isPosition() {
        return position;
    }

    public void setPosition(boolean position) {
        this.position = position;
    }

    public String getWorkingCountry() {
        return workingCountry;
    }

    public void setWorkingCountry(String workingCountry) {
        this.workingCountry = workingCountry;
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

    public int getNumberOfPeople() {
    	return numberOfPeople;
    }

    public void setNumberOfPeople(int number) {
    	this.numberOfPeople = number;
    }

    public ProgramRequirement getProgramRequirement() {
        return programRequirement;
    }

    public void setProgramRequirement(ProgramRequirement programRequirement) {
        this.programRequirement = programRequirement;
    }

}
