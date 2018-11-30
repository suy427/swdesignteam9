package user.student;

import java.util.List;

public class WishCondition {

    private List<String> officeName;
    private List<String> companyName;
    private List<String> workingContry;
    private List<String> position;
    private float minimumGpa;
    private int minimumYear; // 이게 왜 필요하지..?
    private int wage; // 미니멈 붙여야 하려나?
    private String workingTerm;// 이건 자료형을 어케해야하나...

    public WishCondition() {

    }

    public List<String> getOfficeName() {
        return officeName;
    }

    public void setOfficeName(List<String> officeName) {
        this.officeName = officeName;
    }

    public List<String> getCompanyName() {
        return companyName;
    }

    public void setCompanyName(List<String> companyName) {
        this.companyName = companyName;
    }

    public List<String> getWorkingContry() {
        return workingContry;
    }

    public void setWorkingContry(List<String> workingContry) {
        this.workingContry = workingContry;
    }

    public List<String> getPosition() {
        return position;
    }

    public void setPosition(List<String> position) {
        this.position = position;
    }

    public float getMinimumGpa() {
        return minimumGpa;
    }

    public void setMinimumGpa(float minimumGpa) {
        this.minimumGpa = minimumGpa;
    }

    public int getMinimumYear() {
        return minimumYear;
    }

    public void setMinimumYear(int minimumYear) {
        this.minimumYear = minimumYear;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getWorkingTerm() {
        return workingTerm;
    }

    public void setWorkingTerm(String workingTerm) {
        this.workingTerm = workingTerm;
    }
}
