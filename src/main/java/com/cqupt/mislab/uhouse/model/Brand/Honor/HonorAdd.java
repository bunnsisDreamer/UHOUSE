package com.cqupt.mislab.uhouse.model.Brand.Honor;

import io.swagger.annotations.ApiParam;

public class HonorAdd {
    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private int honorId;

    @ApiParam(hidden = true)
    private String honorInfo;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getHonorId() {
        return honorId;
    }

    public void setHonorId(int honorId) {
        this.honorId = honorId;
    }

    public String getHonorInfo() {
        return honorInfo;
    }

    public void setHonorInfo(String honorInfo) {
        this.honorInfo = honorInfo;
    }
}
