package application;

import java.util.ArrayList;
import java.util.Date;

public class SearchFilter {
    private float compatitionRate;
    private ArrayList<String> workingCountry;
    private ArrayList<String> officeName;
    private String programName;
    private String companyName;
    private Date closingDate;
    private ArrayList<String> position;
    private Period workingPeriod;
    private int wage;
    private int numberOfPeople;
    private int minYear;

    public ArrayList<String> getOfficeName() {
        return officeName;
    }

    public void setOfficeName(ArrayList<String> officeName) {
        this.officeName = officeName;
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

    public ArrayList<String> getPosition() {
        return position;
    }

    public void setPosition(ArrayList<String> position) {
        this.position = position;
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

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public ProgramRequirement getProgramRequirement() {
        return programRequirement;
    }

    public void setProgramRequirement(ProgramRequirement programRequirement) {
        this.programRequirement = programRequirement;
    }

    private ProgramRequirement programRequirement;

    public float getCompatitionRate() {
        return compatitionRate;
    }

    public void setCompatitionRate(float compatitionRate) {
        this.compatitionRate = compatitionRate;
    }

    public ArrayList<String> getWorkingCountry() {
        return workingCountry;
    }

    public void setWorkingCountry(ArrayList<String> workingCountry) {
        this.workingCountry = workingCountry;
    }

    public int getMinYear() {
        return minYear;
    }

    public void setMinYear(int minYear) {
        this.minYear = minYear;
    }
}
