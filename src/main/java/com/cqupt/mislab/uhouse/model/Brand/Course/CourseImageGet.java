package com.cqupt.mislab.uhouse.model.Brand.Course;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiParam;

//展示背景图片和修改背景图片
@JsonIgnoreProperties(value = {"courseId","projectId"})
public class CourseImageGet {
    @ApiParam(hidden = true)
    private int courseId;

    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private String pageUrl;


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

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
}
