package com.cqupt.mislab.uhouse.model.Brand.Honor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiParam;

@JsonIgnoreProperties(value = {"honorId","projectId","pictureDescription","url"})
public class HonorImageAdd {
    @ApiParam(hidden = true)
    private int honorId;

    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private String pictureId;

    @ApiParam(hidden = true)
    private String pictureDescription;

    @ApiParam(hidden = true)
    private String url;

    public int getHonorId() {
        return honorId;
    }

    public void setHonorId(int honorId) {
        this.honorId = honorId;
    }

    public int getProjectId() {
        return projectId;
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
