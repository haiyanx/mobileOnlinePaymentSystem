package cn.hy.pojo;

public class TChargeRules extends TChargeRulesKey {
    private String funcName;

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

}