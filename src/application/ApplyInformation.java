package application;

public class ApplyInformation {

    private int programID; //지우라고 피드백받음
    private int studentID; //지우라고 피드백받음
    private int applierNumber; // 이거 뭐하는거였더라..?
    private boolean passState;
    private float compatitionRate; // 이게 5.2면 --> 5.2 : 1인거임

    public ApplyInformation() {

    }

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getApplierNumber() {
        return applierNumber;
    }

    public void setApplierNumber(int applierNumber) {
        this.applierNumber = applierNumber;
    }

    public boolean isPassState() {
        return passState;
    }

    public void setPassState(boolean passState) {
        this.passState = passState;
    }

    public float getCompatitionRate() {
        return compatitionRate;
    }

    public void setCompatitionRate(float compatitionRate) {
        this.compatitionRate = compatitionRate;
    }

}