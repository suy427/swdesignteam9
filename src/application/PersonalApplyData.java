package application;

public class PersonalApplyData {
    private int studentID;
    private boolean passState;

    PersonalApplyData(int stdID) {
        this.studentID = stdID;
        this.passState = false; // default value
    }

    public boolean isPass() {
        return passState;
    }

    public void setPassState(boolean passState) {
        this.passState = passState;
    }
}
