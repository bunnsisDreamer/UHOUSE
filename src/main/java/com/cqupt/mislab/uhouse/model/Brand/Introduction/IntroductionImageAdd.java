package com.cqupt.mislab.uhouse.model.Brand.Introduction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiParam;

@JsonIgnoreProperties(value = {"projectId","pictureDescription","url","introId"})
public class IntroductionImageAdd {
    @ApiParam(hidden = true)
    private int introId;

    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private String pictureId;

    @ApiParam(hidden = true)
    private String pictureDescription;

    @ApiParam(hidden = true)
    private String url;

    public int getProjectId() {
        return projectId;
    }

    public int getIntroId() {
        return introId;
    }

    public void setIntroId(int introId) {
        this.introId = introId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureDescription() {
        return pictureDescription;
    }

    public void setPictureDescription(String pictureDescription) {
        this.pictureDescription = pictureDescription;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
