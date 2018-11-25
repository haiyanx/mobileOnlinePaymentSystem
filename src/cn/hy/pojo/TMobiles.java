package cn.hy.pojo;

public class TMobiles {
    private String mobileNumber;

    private String mobileType;

    private String cardNumber;

    private String isAvailable;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
    }

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String mobileType) {
        this.mobileType = mobileType == null ? null : mobileType.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable == null ? null : isAvailable.trim();
    }

    @Override
    public String toString() {
        return "TMobiles{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", mobileType='" + mobileType + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", isAvailable='" + isAvailable + '\'' +
                '}';
    }
}