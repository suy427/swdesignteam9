package application;

import java.io.*;
import java.util.Scanner;

public class Apply {
    private String applyFilePath = "../DB/Apply/";
    private String internFilePath = "../DB/Internship/";
    private Scanner scan;

    Apply() {
        readFromApplyDB();
    }

    private int getRecruitNumber(int pID) throws Exception {
        String fileName = internFilePath + pID + ".txt";
        File file = new File(fileName);
        String[] informs;
        scan = new Scanner(file);

        informs = scan.nextLine().split(";");
        return Integer.parseInt(informs[6]); // 해당 pID의 채용인원
    }

    private void setApplyInfo(int pID, int stdID) throws Exception {
        String fileName = applyFilePath + pID + ".txt";
        File file = new File(fileName);
        String[] informs;
        ApplyInformation newForm = new ApplyInformation();
        scan = new Scanner(file);

        if(file.exists()) { // 해당 pID에 대한 파일이 있으면
            informs = scan.nextLine().split(";");
            newForm.setProgramID(Integer.parseInt(informs[0]))
                    .setApplierNumber(Integer.parseInt(informs[1]) + 1)
                    .setCompatitionRate(newForm.applierNumber/getRecruitNumber(pID))
                    .setPersonalApplyData(informs[3]+","+pID+" "+ stdID);
        }
        else { // 해당 pID에 대한 파일이 없으면
            newForm.setProgramID(pID)
                    .setApplierNumber(1)
                    .setCompatitionRate(1/getRecruitNumber(pID))
                    .setPersonalApplyData(pID+" "+stdID);
        }
        writeToApplyDB(pID, newForm);
    }

    public void apply(int pID, int stdID) throws Exception { //
        setApplyInfo(pID, stdID);
    }

    public void readFromApplyDB() {
        // 이건 사실 내가 지원한 정보들을 출력하는 앤데 지금 안하겠음 일단.

    }

    public void writeToApplyDB(int pID, ApplyInformation information) throws Exception {
        FileWriter writer = new FileWriter(applyFilePath + pID + ".txt", false);
        writer.write(information.programID+
                ";"+information.applierNumber+
                ";"+information.compatitionRate+
                ";"+information.personalApplyData);
        writer.flush();
    }

    public void cancelApply(int pID, int stdID) throws Exception {
        String fileName = applyFilePath + pID + ".txt";
        File file = new File(fileName);
        ApplyInformation newForm = new ApplyInformation();
        String newInforms="";
        scan = new Scanner(file);

        String[] informs = scan.nextLine().split(";")[3].split(","); // std state,std state,std state ....
        newForm.setProgramID(Integer.parseInt(informs[0]))
                .setApplierNumber(Integer.parseInt(informs[1]) + 1)
                .setCompatitionRate(newForm.applierNumber/getRecruitNumber(pID));

        for(String inform : informs)
            if(inform.contains(Integer.toString(stdID)) == false)
                newInforms += inform;

        newForm.setPersonalApplyData(newInforms);
    }

    private String showPersonalApplyData(int pID, int stdID) throws Exception {
        String fileName = applyFilePath + pID + ".txt";
        File file = new File(fileName);
        String[] informs;
        ApplyInformation newForm = new ApplyInformation();
        scan = new Scanner(file);

        informs = scan.nextLine().split(";")[3].split(",");

        for(String inform : informs)
            if(inform.contains(Integer.toString(stdID)))    return inform;

        return null;
    }
}