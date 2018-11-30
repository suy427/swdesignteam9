package user;

import application.InternshipProgram;

import java.util.ArrayList;

public class Office extends User {

    private int officeID;
    private String officeName;
    private ArrayList<InternshipProgram> internshipPrograms; //단복수??

    public Office() {

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

    public ArrayList<InternshipProgram> getInternshipPrograms() {
        return internshipPrograms;
    }

    public void setInternshipPrograms(ArrayList<InternshipProgram> internshipPrograms) {
        this.internshipPrograms = internshipPrograms;
    }

    void alarm() {

    }
}
