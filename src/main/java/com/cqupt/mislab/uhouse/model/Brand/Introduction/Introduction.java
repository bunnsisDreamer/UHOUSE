package com.cqupt.mislab.uhouse.model.Brand.Introduction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiParam;

//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "brand_intro")
@JsonIgnoreProperties(value = {"projectId"})
public class Introduction {
    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private String name;

    @ApiParam(hidden = true)
    private String description;

    @ApiParam(hidden = true)
    private String videoUrl;

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

