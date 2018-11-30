package user.student;

import java.util.List;

public class ExtraQualification {

    private List<String> carrier;
    private boolean militeryService;
    private List<String> extraActivity;
    private List<String> award;
    private List<String> certificate;

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

    public List<String> getExtraActivity() {
        return extraActivity;
    }

    public void setExtraActivity(List<String> extraActivity) {
        this.extraActivity = extraActivity;
    }

    public List<String> getAward() {
        return award;
    }

    public void setAward(List<String> award) {
        this.award = award;
    }

    public List<String> getCertificate() {
        return certificate;
    }

    public void setCertificate(List<String> certificate) {
        this.certificate = certificate;
    }
}
