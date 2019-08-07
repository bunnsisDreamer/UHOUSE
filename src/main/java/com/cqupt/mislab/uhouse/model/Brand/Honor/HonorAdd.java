package com.cqupt.mislab.uhouse.model.Brand.Honor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiParam;

@JsonIgnoreProperties(value = {"projectId","honorInfo","honorId"})
public class HonorAdd {
    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private int infoId;

    @ApiParam(hidden = true)
    private int honorId;

    @ApiParam(hidden = true)
    private String honorInfo;

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

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
