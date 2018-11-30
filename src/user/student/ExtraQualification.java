package user.student;

import java.util.List;

public class ExtraQualification {

    private List<String> carrier;
    private boolean militeryService;
    private List<String> extraActivities;
    private List<String> award;
    private List<String> certification;

    public ExtraQualification() {

    }

    public List<String> getCarrier() {
        return carrier;
    }

    public void setCarrier(List<String> carrier) {
        this.carrier = carrier;
    }

    public boolean isMiliteryService() {
        return militeryService;
    }

    public void setMiliteryService(boolean militeryService) {
        this.militeryService = militeryService;
    }

    public List<String> getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(List<String> extraActivities) {
        this.extraActivities = extraActivities;
    }

    public List<String> getAward() {
        return award;
    }

    public void setAward(List<String> award) {
        this.award = award;
    }

    public List<String> getCertification() {
        return certification;
    }

    public void setCertification(List<String> certification) {
        this.certification = certification;
    }
}
