package cn.hy.pojo;

import javax.validation.constraints.Size;

public class TOperator {
    @Size(min = 1,max = 13,message = "{TOperator.operatorId.error.size}")
    private String operatorId;
    @Size(min = 1,max = 13,message = "{TOperator.operatorPwd.error.size}")
    private String operatorName;

    private String operatorPwd;

    private String isAdmin;

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public String getOperatorPwd() {
        return operatorPwd;
    }

    public void setOperatorPwd(String operatorPwd) {
        this.operatorPwd = operatorPwd == null ? null : operatorPwd.trim();
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin == null ? null : isAdmin.trim();
    }

    @Override
    public String toString() {
        return "TOperator{" +
                "operatorId='" + operatorId + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", operatorPwd='" + operatorPwd + '\'' +
                ", isAdmin='" + isAdmin + '\'' +
                '}';
    }
}