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

            return programData;
        }
        else {// 해당 pID가 없으면
            programData = new Apply(pID, stdID);
            return programData;
        }
        //saveInfo(ApplyInformation data); //파일 입력
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
    // FileInputStream(sdfasdfasdf);
    //}

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public int getApplierNumber() {
        return applierNumber;
    }

    public void setApplierNumber(int applierNumber) {
        this.applierNumber = applierNumber;
    }
}