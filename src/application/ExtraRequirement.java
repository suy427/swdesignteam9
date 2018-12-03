package application;

import java.util.ArrayList;

public class ExtraRequirement {

    private boolean carrier;
    private boolean militaryService;
    private ArrayList<String> certificate = new ArrayList<>();

    ExtraRequirement() {

    }

    public boolean isCarrier() {
        return carrier;
    }

    public void setCarrier(boolean carrier) {
        this.carrier = carrier;
    }

    public boolean isMilitaryService() {
        return militaryService;
    }

    public void setMilitaryService(boolean militaryService) {
        this.militaryService = militaryService;
    }

    public ArrayList<String> getCertificate() {
        return certificate;
    }

    public void setCertificate(ArrayList<String> certificate) {
        this.certificate = certificate;
    }
}
