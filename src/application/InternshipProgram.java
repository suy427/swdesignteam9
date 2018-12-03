package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InternshipProgram {

	private ArrayList<ProgramInformation> internshipData = new ArrayList<>();

    public InternshipProgram() {

    }

    public void makeInternshipProgram() { // 등록

    }

    public void setInternshipProgram() { // 수정

    }

    public void removeInternshipProgram() { // 삭제

    }

    public void apply(int pID, int stdID) { // button onClick�궡遺��뿉�꽌 pID, stdID瑜� 以��떎.
        Apply.getInstance(pID, stdID);
    }

    public ArrayList<ProgramInformation> searchInternship(SearchFilter selectedCondition, ArrayList<Integer> selectedOptions) { //선택한 옵션 항목들(필터)
    	ArrayList<ProgramInformation> searchResult = new ArrayList<>();

    	for(ProgramInformation program : internshipData) {
    		checkOption : for(int option : selectedOptions) { //선택한 옵션마다 확인
    			switch(option) {
					case 0: // 키워드 검색
						if(program.getProgramName().contains(selectedCondition.getKeyword()))
							break;

						break checkOption;

					case 1: //모집기간
						if(program.getClosingDate().compareTo(selectedCondition.getClosingDate()) < 0)
							break checkOption;

						break;

					case 2: //모집기관. office
						for(String office : selectedCondition.getOfficeName())
							if(program.getOfficeName().equals(office))
								break;

						break checkOption;

					case 3: //모집회사
						for(String company : selectedCondition.getWorkingCountry())
							if(program.getWorkingCountry().equals(company))
								break;

						break checkOption;

					case 4: //학년. year
						if(selectedCondition.getProgramRequirement().getMinYear() < program.getProgramRequirement().getMinYear())
							break checkOption;
						break;

					case 5: //직무. position
						for(String position : selectedCondition.getPosition())
							if(program.getPosition().equals(position))
								break;

						break checkOption;

					case 6: //국가.
						for(String country : selectedCondition.getWorkingCountry())
							if(program.getWorkingCountry().equals(country))
								break;

						break checkOption;

					case 7: //파견기간. workingPeriod
						if(selectedCondition.getWorkingPeriod().endDate == null) // 시작만 설정
							if(program.getWorkingPeriod().startDate.compareTo(selectedCondition.getWorkingPeriod().startDate) < 0)
								break checkOption;

						else if(selectedCondition.getWorkingPeriod().startDate == null) // 끝만 설정
							if(program.getWorkingPeriod().endDate.compareTo(selectedCondition.getWorkingPeriod().endDate) > 0)
								break checkOption;

						else // 둘 다 설정
							if(program.getWorkingPeriod().startDate.compareTo(selectedCondition.getWorkingPeriod().startDate) < 0 ||
									program.getWorkingPeriod().endDate.compareTo(selectedCondition.getWorkingPeriod().endDate) > 0)
								break checkOption;
						break;

					case 8: //경쟁률
						if(selectedCondition.getCompatitionRate() > Apply.getInstance(program.getProgramID()).getCompatitionRate())
							break checkOption;

						break;

					case 9: //모집인원
						if(selectedCondition.getNumberOfPeople() > program.getNumberOfPeople()) //사용자가 선택한 뽑는 인원 > 실제 뽑는인원 이면 skip
							break checkOption;

						break;

					case 10: //봉급
						if(selectedCondition.getWage() > program.getWage()) //사용자가 선택한 wage > 실제 프로그램의 wage 이면 skip
							break checkOption;

						break;
    			}
    			searchResult.add(program);
    		}
    	}
    	return searchResult;
    }

	public ProgramInformation getInternshipData(int pID) {
		return internshipData.get(pID);
	}

    public boolean isClosed(int pID) {
		if(internshipData.get(pID).getClosingDate().compareTo(new Date()) < 0)
        	return true;

		else return false;
    }
}

