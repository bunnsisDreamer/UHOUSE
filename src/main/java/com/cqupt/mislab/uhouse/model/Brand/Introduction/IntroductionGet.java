package com.cqupt.mislab.uhouse.model.Brand.Introduction;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiParam;

@JsonIgnoreProperties(value = "projectId")
public class IntroductionGet {
    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private String name;

    @ApiParam(hidden = true)
    private String description;

    @ApiParam(hidden = true)
    private String videoUrl;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
