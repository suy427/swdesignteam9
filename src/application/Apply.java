package application;

import user.student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Apply {

    private static HashMap<Integer, Apply> __InfoInstances = new HashMap<>();
    private HashMap<Integer, PersonalApplyData> personalApplyData = new HashMap<>();
    private int programID; //지우라고 피드백받음
    private int applierNumber; // 몇명째로 지원하는거냐...
    private float compatitionRate;

    private Apply(int pID, int stdID) {
        this.programID = pID;
        this.personalApplyData.put(stdID, new PersonalApplyData(stdID));
        this.applierNumber = 1;
    }

    public static Apply getInstance(int pID, int stdID) { // pID당 하나의 instance를 생성
        Apply programData;
        Map<Integer, PersonalApplyData> studentData;

        if (__InfoInstances.containsKey(pID)) { // 해당하는 pID가 있으면 그걸 return
            programData = __InfoInstances.get(pID);
            studentData = programData.personalApplyData;

            studentData.put(stdID, new PersonalApplyData(stdID));
            programData.applierNumber++;
            programData.compatitionRate = programData.applierNumber/(new InternshipProgram()).getInternshipData(pID).getNumberOfPeople();

            return programData;
        }
        else {// 해당 pID가 없으면
            programData = new Apply(pID, stdID);
            return programData;
        }
        //saveInfo(ApplyInformation data); //파일 입력
    }

    public static Apply getInstance(int pID) { // 해당 pID의 프로그램 instance를 가져옴
        if (__InfoInstances.containsKey(pID)) // 해당하는 pID가 있으면 그걸 return
            return __InfoInstances.get(pID);
        else    return null; // 없으면 null
    }

    public void cancelApply(int stdID) {
        personalApplyData.remove(stdID);
    }

    public HashMap<Integer, PersonalApplyData> showPersonalApplyData(ArrayList<Integer> applyInfo) {
        HashMap<Integer, PersonalApplyData> returnMap = new HashMap<>();

        for(Integer programID : applyInfo)
            returnMap.put(programID, personalApplyData.get(programID));

        return returnMap;
    }


    //private void saveInfo(ApplyInformation data) {
    public int getProgramID() {
        return programID;
    }

    //}
    public void setProgramID(int programID) {
        this.programID = programID;
    }

    // FileInputStream(sdfasdfasdf);
    public int getApplierNumber() {
        return applierNumber;
    }

    public void setApplierNumber(int applierNumber) {
        this.applierNumber = applierNumber;
    }

    public float getCompatitionRate() {
        return compatitionRate;
    }

    public void setCompatitionRate(float compatitionRate) {
        this.compatitionRate = compatitionRate;
    }
}