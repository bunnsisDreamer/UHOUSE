package com.cqupt.mislab.uhouse.model.Brand.Honor;

import io.swagger.annotations.ApiParam;

public class Honor {
    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private int HonorId;

    @ApiParam(hidden = true)
    private int infoId;

    @ApiParam(hidden = true)
    private String honor_info;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getHonorId() {
        return HonorId;
    }

    public void setHonorId(int honorId) {
        HonorId = honorId;
    }

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public String getHonor_info() {
        return honor_info;
    }

    public void setHonor_info(String honor_info) {
        this.honor_info = honor_info;
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

    @ApiParam(hidden = true)
    private int pictureId;

    @ApiParam(hidden = true)
    private String pictureDescription;

    @ApiParam(hidden = true)
    private String url;
}
