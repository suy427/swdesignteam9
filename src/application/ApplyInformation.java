package application;


import java.util.ArrayList;

public class ApplyInformation { // 특정 pID

    public String personalApplyData;
    public int programID;
    public int applierNumber=0; // 몇명째로 지원하는거냐...
    public float compatitionRate=1;

    public ApplyInformation setPersonalApplyData(String personalApplyData) {
        this.personalApplyData = personalApplyData;
        return this;
    }
    public ApplyInformation setProgramID(int programID) {
        this.programID = programID;
        return this;
    }
    public ApplyInformation setApplierNumber(int num) {
        this.applierNumber = num;
        return this;
    }
    public ApplyInformation setCompatitionRate(float compatitionRate) {
        this.compatitionRate = compatitionRate;
        return this;
    }
}