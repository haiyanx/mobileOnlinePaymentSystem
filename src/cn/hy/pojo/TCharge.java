package cn.hy.pojo;

public class TCharge {
    private String chargeCode;

    private String chargeName;

    private Double charge;

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode == null ? null : chargeCode.trim();
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName == null ? null : chargeName.trim();
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }
}