package user;

public class Office extends User {

    private int officeID;
    private String officeName;

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

    void alarm() {

    }
}
