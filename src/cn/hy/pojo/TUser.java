package cn.hy.pojo;

public class TUser {
    private Integer userId;

    private String mobileNumber;

    private String roamingStatus;

    private String comLevel;

    private Integer customerId;

    private Integer accountId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
    }

    public String getRoamingStatus() {
        return roamingStatus;
    }

    public void setRoamingStatus(String roamingStatus) {
        this.roamingStatus = roamingStatus == null ? null : roamingStatus.trim();
    }

    public String getComLevel() {
        return comLevel;
    }

    public void setComLevel(String comLevel) {
        this.comLevel = comLevel == null ? null : comLevel.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}