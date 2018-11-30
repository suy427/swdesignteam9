package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApplyInformation {

    private static Map<Integer, ApplyInformation> __InfoInstances;
    private int programID; //지우라고 피드백받음
    private ArrayList<Integer> studentID; //지우라고 피드백받음
    private int applierNumber; // 몇명째로 지원하는거냐...
    //private boolean passState;
    //private float compatitionRate; // 얘는 applierNumber : 뽑는인원


    private ApplyInformation(int pID, int stdID) {
        this.programID = pID;
        this.studentID.add(stdID);
        this.applierNumber = 1;
    }

    public static ApplyInformation getInstance(int pID, int stdID) { // pID당 하나의 instance를 생성
        if (__InfoInstances.containsKey(pID)) { // 해당하는 pID가 있으면 그걸 return
            __InfoInstances.get(pID).studentID.add(stdID);
            __InfoInstances.get(pID).applierNumber++;

            return __InfoInstances.get(pID);
        } else {// 해당 pID가 없으면
            __InfoInstances.put(pID, new ApplyInformation(pID, stdID));
            return __InfoInstances.get(pID);
        }
        //saveInfo(ApplyInformation data); //파일 입력
    }

    //private void saveInfo(ApplyInformation data) {
    // FileInputStream(sdfasdfasdf);
    //}


    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public ArrayList<Integer> getStudentID() {
        return studentID;
    }

    public void setStudentID(ArrayList<Integer> studentID) {
        this.studentID = studentID;
    }

    public int getApplierNumber() {
        return applierNumber;
    }

    public void setApplierNumber(int applierNumber) {
        this.applierNumber = applierNumber;
    }

//    public boolean isPassed() {
//        return passState;
//    }
//
//    public void setPassState(boolean passState) {
//        this.passState = passState;
//    }



}