package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InternshipProgram {

	private ArrayList<ProgramInformation> internshipData = new ArrayList<>();

    public InternshipProgram() {

    }

    public void makeInternshipProgram() { // �벑濡�

    }

    public void setInternshipProgram() { // �닔�젙

    }

    public void removeInternshipProgram() { // �궘�젣

    }

    public void apply(int pID, int stdID) { // button onClick�궡遺��뿉�꽌 pID, stdID瑜� 以��떎.
        Apply.getInstance(pID, stdID);
    }

    public ArrayList<ProgramInformation> searchInternship(ProgramInformation filteredCondition, ArrayList<Integer> selectedOptions) { //선택한 옵션 항목들(필터)
    	ArrayList<ProgramInformation> searchResult = new ArrayList<>();
    	
    	for(ProgramInformation program : internshipData) {    		
    		check : for(int option : selectedOptions) { //선택한 옵션마다 확인
    			switch(option) {
    			case 1: //모집기간
    				break;
    			case 2: //모집기관. office
    				break;
    			case 3: //모집회사 
    				break;
    			case 4: //학년. year
    				break;
    			case 5: //직무. position
    				break;
    			case 6: //국가.
    				break;
    			case 7: //파견기간. workingPeriod
    				break;
    			case 8: //경쟁률
    				break;
    			case 9: //모집인원
    				if(filteredCondition.getWage() > program.getWage()) { //사용자가 선택한 wage > 실제 프로그램의 wage 이면 do not add!
    					break check;
    				}
    				break;
    			case 10: //봉급
    				if(filteredCondition.getWage() > program.getWage()) { //사용자가 선택한 wage > 실제 프로그램의 wage 이면 do not add!
    					break check;
    				}
    				break;
    			}
    			searchResult.add(program);
    		}
    	
    	}
    	
    	return searchResult;
    }

    public boolean isClosed() {

        return false; // default value
    }
}

