package com.cqupt.mislab.uhouse.model.Brand.Course;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiParam;

//展示历程信息
@JsonIgnoreProperties(value = "projectId")
public class CourseGet {
    @ApiParam(hidden = true)
    private int projectId;

    @ApiParam(hidden = true)
    private int infoId;

    @ApiParam(hidden = true)
    private String courseTime;

    @ApiParam(hidden = true)
    private String courseTitle;

    @ApiParam(hidden = true)
    private String courseInfo;

    @ApiParam(hidden = true)
    private String courseUrl;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo;
    }

    public String getCourseUrl() {
        return courseUrl;
    }

    public void setCourseUrl(String courseUrl) {
        this.courseUrl = courseUrl;
    }
}
