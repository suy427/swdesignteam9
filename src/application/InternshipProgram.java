package application;

import java.util.HashMap;
import java.util.Map;

public class InternshipProgram {

    private HashMap<Integer, InternshipData> internshipData = new HashMap<>();

    public InternshipProgram() {

    }

    public void makeInternshipProgram() { // 등록

    }

    public void setInternshipProgram() { // 수정

    }

    public void removeInternshipProgram() { // 삭제

    }

    public void apply(int pID, int stdID) { // button onClick내부에서 pID, stdID를 준다.
        Apply.getInstance(pID, stdID);
    }

    public void searchInternship() {

    }

    public boolean isClosed() {

        return false; // default value
    }
}

