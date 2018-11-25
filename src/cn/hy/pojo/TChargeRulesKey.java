package cn.hy.pojo;

public class TChargeRulesKey {
    private String funcId;

    private String chargeCode;

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId == null ? null : funcId.trim();
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode == null ? null : chargeCode.trim();
    }
}