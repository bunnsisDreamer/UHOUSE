package com.cqupt.mislab.uhouse.model.Brand.Culture;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiParam;

//用于展示文化内容
@JsonIgnoreProperties(value = "projectId")
public class CultureGet {
    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private int infoId;

    @ApiParam(hidden = true)
    private String cultureTitle;

    @ApiParam(hidden = true)
    private String cultureInfo;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public String getCultureTitle() {
        return cultureTitle;
    }

    public void setCultureTitle(String cultureTitle) {
        this.cultureTitle = cultureTitle;
    }

    public String getCultureInfo() {
        return cultureInfo;
    }

    public void setCultureInfo(String cultureInfo) {
        this.cultureInfo = cultureInfo;
    }
}
