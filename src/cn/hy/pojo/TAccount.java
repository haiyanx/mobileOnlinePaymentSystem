package cn.hy.pojo;

public class TAccount {
    private Integer accountId;

    private String contactPerson;

    private String contactAddress;

    private Double contactBalance;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public Double getContactBalance() {
        return contactBalance;
    }

    public void setContactBalance(Double contactBalance) {
        this.contactBalance = contactBalance;
    }
}