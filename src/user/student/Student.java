package user.student;

import application.ApplyInformation;
import user.User;

import java.util.ArrayList;

public class Student extends User {

    private String name;
    private int studentID;
    private int year;
    private String major;
    private float gpa;
    private String gender; // will be replaced enum later
    private String englishLevel; // will be replaced enum later

    //privqte ArrayList<InternshipProgram> wishList; 이거인게 아닐까 하하
    private ArrayList<ApplyInformation> wishList;
    private ArrayList<ApplyData> myApplyInfo;
    private WishCondition wishCondition;
    private ExtraQualification extraQualification;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public WishCondition getWishCondition() {
        return wishCondition;
    }

    public void setWishCondition(WishCondition wishCondition) {
        this.wishCondition = wishCondition;
    }

//    public ArrayList<ApplyInformation> getMyApplyInfo() {
//        return myApplyInfo;
//    }
//
//    public void setMyApplyInfo(ArrayList<ApplyInformation> myApplyInfo) {
//        this.myApplyInfo = myApplyInfo;
//    }

    public ExtraQualification getExtraQualification() {
        return extraQualification;
    }

    public void setExtraQualification(ExtraQualification extraQualification) {
        this.extraQualification = extraQualification;
    }
}
