package application;

public class ProgramRequirement {
	private int minYear;
	private String majorCondition; // ?�� ?���? ?���? �??��?��?��?��??..?��?��
    private float minGpa;
    private int englishLevel;
    private ExtraRequirement extraRequirement;
    

    public int getMinYear() {
        return minYear;
    }

    public void setMinYear(int minYear) {
        this.minYear = minYear;
    }

    public String getMajorCondition() {
        return majorCondition;
    }

    public void setMajorCondition(String majorCondition) {
        this.majorCondition = majorCondition;
    }

    public float getMinGpa() {
        return minGpa;
    }

    public void setMinGpa(float minGpa) {
        this.minGpa = minGpa;
    }

    public int getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(int englishLevel) {
        this.englishLevel = englishLevel;
    }

    public ExtraRequirement getExtraRequirement() {
        return extraRequirement;
    }

    public void setExtraRequirement(ExtraRequirement extraRequirement) {
        this.extraRequirement = extraRequirement;
    }
}
