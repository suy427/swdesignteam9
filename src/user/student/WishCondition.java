package user.student;

import java.util.Date;
import java.util.List;

public class WishCondition {

    private List<String> officeName;
    private List<String> companyName;
    private List<String> workingContry;
    private List<String> position;
    private float minGpa;
    private int minYear;
    private int minWage;

    private Date workingTerm;// 일단은 Date형으로 했당
    //private String workingTerm;// 이건 자료형을 어케해야하나...

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

    public float getMinGpa() {
        return minGpa;
    }

    public void setMinGpa(float minGpa) {
        this.minGpa = minGpa;
    }

    public int getMinYear() {
        return minYear;
    }

    public void setMinYear(int minYear) {
        this.minYear = minYear;
    }

    public int getMinWage() {
        return minWage;
    }

    public void setMinWage(int minWage) {
        this.minWage = minWage;
    }

    public Date getWorkingTerm() {
        return workingTerm;
    }

    public void setWorkingTerm(Date workingTerm) {
        this.workingTerm = workingTerm;
    }
}
