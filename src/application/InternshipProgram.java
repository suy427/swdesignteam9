package application;

import java.lang.reflect.Array;
import java.util.*;

public class InternshipProgram {

	private ArrayList<ProgramInformation> internshipData = new ArrayList<>();

    public InternshipProgram() {

    }

    public void makeInternshipProgram(ProgramInformation programInformation) { // 등록
		internshipData.add(programInformation);
    }

    public void setInternshipProgram(int pID) { // 수정
		ProgramInformation newProgram = new ProgramInformation();

		internshipData.add(pID, newProgram);
    }

    public void removeInternshipProgram(int pID) { // 삭제
		internshipData.remove(pID);
    }

    public void apply(int pID, int stdID) { // button onClick�궡遺��뿉�꽌 pID, stdID瑜� 以��떎.
        Apply.getInstance(pID, stdID);
    }

    public ArrayList<ProgramInformation> searchByMyInfo(int myYear, String myMajor, float myGpa, int myEnglishLevel) {
    	ArrayList<ProgramInformation> resultProgram = new ArrayList<>();

    	for(ProgramInformation program : internshipData) {
    		if(myYear < program.getProgramRequirement().getMinYear())	break;
    		if(!myMajor.equals(program.getProgramRequirement().getMajorCondition())) break;
			if(myGpa < program.getProgramRequirement().getMinGpa()) break;
			if(myEnglishLevel < program.getProgramRequirement().getEnglishLevel()) break;

    		resultProgram.add(program);
		}
    	return resultProgram;
	}

    public ArrayList<ProgramInformation> searchInternship(SearchFilter selectedCondition, ArrayList<Integer> selectedOptions) { //선택한 옵션 항목들(필터)
    	ArrayList<ProgramInformation> searchResult = new ArrayList<>();

		checkOption : for(ProgramInformation program : internshipData) {
			for(int option : selectedOptions) { //선택한 옵션마다 확인
				switch(option) {
					case 0: // 키워드 검색
						if(program.getProgramName().contains(selectedCondition.getKeyword()))
							break;

						continue checkOption;

					case 1: //모집기간
						if(program.getClosingDate().compareTo(selectedCondition.getClosingDate()) < 0)
							continue checkOption;

						break;

					case 2: //모집기관. office
						for(String office : selectedCondition.getOfficeName())
							if(program.getOfficeName().equals(office))
								break;

						continue checkOption;

					case 3: //모집회사
						for(String company : selectedCondition.getWorkingCountry())
							if(program.getWorkingCountry().equals(company))
								break;

						break checkOption;

					case 4: //학년. year
						if(selectedCondition.getProgramRequirement().getMinYear() < program.getProgramRequirement().getMinYear())
							continue checkOption;
						break;

					case 5: //직무. position
						for(String position : selectedCondition.getPosition())
							if(program.getPosition().equals(position))
								break;

						continue checkOption;

					case 6: //국가.
						for(String country : selectedCondition.getWorkingCountry())
							if(program.getWorkingCountry().equals(country))
								break;

						break checkOption;

					case 7: //파견기간. workingPeriod
						if(selectedCondition.getWorkingPeriod().endDate == null) // 시작만 설정
							if(program.getWorkingPeriod().startDate.compareTo(selectedCondition.getWorkingPeriod().startDate) < 0)
								continue checkOption;

							else if(selectedCondition.getWorkingPeriod().startDate == null) // 끝만 설정
								if(program.getWorkingPeriod().endDate.compareTo(selectedCondition.getWorkingPeriod().endDate) > 0)
									continue checkOption;

								else // 둘 다 설정
									if(program.getWorkingPeriod().startDate.compareTo(selectedCondition.getWorkingPeriod().startDate) < 0 ||
											program.getWorkingPeriod().endDate.compareTo(selectedCondition.getWorkingPeriod().endDate) > 0)
										continue checkOption;
						break;

					case 8: //경쟁률
						if(selectedCondition.getCompatitionRate() > Apply.getInstance(program.getProgramID()).getCompatitionRate())
							continue checkOption;

						break;

					case 9: //모집인원
						if(selectedCondition.getNumberOfPeople() > program.getNumberOfPeople()) //사용자가 선택한 뽑는 인원 > 실제 뽑는인원 이면 skip
							continue checkOption;

						break;

					case 10: //봉급
						if(selectedCondition.getWage() > program.getWage()) //사용자가 선택한 wage > 실제 프로그램의 wage 이면 skip
							continue checkOption;

						break;
				}
			}
			searchResult.add(program);
		}
    	return searchResult;
    }

    private ArrayList<ProgramInformation> sortResult(ArrayList<ProgramInformation> sortingResult, int option) {
    	switch (option) {
			case 1: //최신 등록순
				Collections.reverse(sortingResult);
				break;

			case 2: // 마감 임박순
				Collections.sort(sortingResult);
				break;
		}
    	return sortingResult;
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

