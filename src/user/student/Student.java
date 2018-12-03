package user.student;

import user.User;

import java.util.ArrayList;

public class Student extends User {

    private String name;
    private int studentID;
    private int year;
    private String major;
    private float gpa;
    private String gender; // will be replaced enum later
    private int englishLevel; // int로 3,2,1 -> high, middle, low
    private ArrayList<Integer> wishList = new ArrayList<>(); // programID를 저장
    private ArrayList<Integer> myApplyInfo = new ArrayList<>(); // programID를 저장
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(int englishLevel) {
        this.englishLevel = englishLevel;
    }

    public ArrayList<Integer> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<Integer> wishList) {
        this.wishList = wishList;
    }

    public ArrayList<Integer> getMyApplyInfo() {
        return myApplyInfo;
    }

    public void setMyApplyInfo(ArrayList<Integer> myApplyInfo) {
        this.myApplyInfo = myApplyInfo;
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
