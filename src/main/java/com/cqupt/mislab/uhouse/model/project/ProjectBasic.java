package com.cqupt.mislab.uhouse.model.project;


public class ProjectBasic {

    private int projectId;
    private String projectName;
    private String basicInform;
    private String phoneNum;
    private String description;
    private String QR_codeUrl;

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setBasicInform(String basicInform) {
        this.basicInform = basicInform;
    }

    public String getBasicInform() {
        return basicInform;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQR_codeUrl(String QR_codeUrl) {
        this.QR_codeUrl = QR_codeUrl;
    }

    public String getQR_codeUrl() {
        return QR_codeUrl;
    }
}
