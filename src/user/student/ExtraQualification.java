package user.student;

import java.util.ArrayList;
import java.util.List;

public class ExtraQualification {

    private ArrayList<String> carrier = new ArrayList<>();
    private boolean militeryService;
    private ArrayList<String> extraActivity = new ArrayList<>();
    private ArrayList<String> award = new ArrayList<>();
    private ArrayList<String> certificate = new ArrayList<>();

    public ExtraQualification() {

    }

    public List<String> getCarrier() {
        return carrier;
    }

    public void setCarrier(ArrayList<String> carrier) {
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

    public void setExtraActivity(ArrayList<String> extraActivity) {
        this.extraActivity = extraActivity;
    }

    public List<String> getAward() {
        return award;
    }

    public void setAward(ArrayList<String> award) {
        this.award = award;
    }

    public List<String> getCertificate() {
        return certificate;
    }

    public void setCertificate(ArrayList<String> certificate) {
        this.certificate = certificate;
    }
}
