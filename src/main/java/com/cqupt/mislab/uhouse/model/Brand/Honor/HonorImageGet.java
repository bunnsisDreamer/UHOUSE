package com.cqupt.mislab.uhouse.model.Brand.Honor;

import io.swagger.annotations.ApiParam;

public class HonorImageGet {
    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private int pictureId;

    @ApiParam(hidden = true)
    private String pictureDescription;

    @ApiParam(hidden = true)
    private String url;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
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
