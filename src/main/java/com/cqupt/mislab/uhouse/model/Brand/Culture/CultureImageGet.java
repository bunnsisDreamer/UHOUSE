package com.cqupt.mislab.uhouse.model.Brand.Culture;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiParam;


//用于展示图片信息和修改背景图片
@JsonIgnoreProperties(value = "projectId")
public class CultureImageGet {
    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private String pageUrl;

    @ApiParam(hidden = true)
    private String cultureUrl;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getCultureUrl() {
        return cultureUrl;
    }

    public void setCultureUrl(String cultureUrl) {
        this.cultureUrl = cultureUrl;
    }
}
