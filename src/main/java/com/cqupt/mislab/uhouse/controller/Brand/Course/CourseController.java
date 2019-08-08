package com.cqupt.mislab.uhouse.controller.Brand.Course;

import com.cqupt.mislab.uhouse.common.response.ResponseEntity;
import com.cqupt.mislab.uhouse.constant.Message;
import com.cqupt.mislab.uhouse.constant.ReturnCode;
import com.cqupt.mislab.uhouse.model.Brand.Course.Course;
import com.cqupt.mislab.uhouse.model.Brand.Course.CourseAdd;
import com.cqupt.mislab.uhouse.model.Brand.Course.CourseGet;
import com.cqupt.mislab.uhouse.model.Brand.Course.CourseImageGet;
import com.cqupt.mislab.uhouse.service.Brand.Course.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand/develop")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @ApiOperation(value = "品牌概括_发展历程_展示背景图片接口",notes = "展示历程信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query")
            }
    )
    @GetMapping("/backgroundImage/get")
    public ResponseEntity<CourseImageGet> getImage(CourseImageGet courseImageGet){
        CourseImageGet course=courseService.findImageByProjectId(courseImageGet);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.SUCCESS,course);
    }

    @ApiOperation(value = "品牌概括_发展历程_展示历程信息接口",notes = "展示全部的历程信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name="projectId",value ="确定项目归属",required = true,paramType = "query")
            }
    )
    @GetMapping("/get")
    public ResponseEntity<CourseGet> getCourse(CourseGet courseGet){
        List<CourseGet> course=courseService.findCourseByProjectId(courseGet);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.SUCCESS,course);
    }

    @ApiOperation(value = "品牌概括_发展历程_修改背景图片接口",notes="修改背景图片")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name="projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name="pageUrl",value = "图片",required = true,paramType = "query")
            }
    )
    @PutMapping("/backgroundImage/update")
    public ResponseEntity<Object> updateImage(CourseImageGet courseImageGet){
        boolean course=courseService.updateImage(courseImageGet);
        if(course)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.UPDATE_SUCCESS,null);
        else
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.UPDATE_IS_FAIL,null);
    }

    @ApiOperation(value = "品牌概括_发展历程_修改历程信息",notes = "修改历程信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "infoId",value = "id",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "courseTime",value = "历程具体时间",required = true,paramType = "query"),
                    @ApiImplicitParam(name="courseTitle",value = "历程标题",required = true,paramType = "query"),
                    @ApiImplicitParam(name="courseInfo",value = "历程描述",required = true,paramType = "query"),
                    @ApiImplicitParam(name="courseUrl",value = "历程图片",required = true,paramType = "query")
            }
    )
    @PutMapping("/update")
    public ResponseEntity<Object> updateCourse(CourseAdd courseAdd){
        boolean course=courseService.updateCourse(courseAdd);
        if(course)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.UPDATE_SUCCESS,null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE,Message.UPDATE_IS_FAIL,null);
    }

    @ApiOperation(value = "品牌概括_发展历程_新增历程信息接口",notes = "新增历程信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "courseTime",value = "历程具体时间",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "courseTitle",value = "历程标题",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "courseInfo",value = "历程描述",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "courseUrl",value = "历程图片",required = true,paramType = "query")
            }
    )
    @PostMapping("/add")
    public ResponseEntity<Object> addCourse(CourseAdd courseAdd){
        boolean course = courseService.addCourse(courseAdd);
        if(course)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.ADD_SUCCESS,courseAdd);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE,Message.ADD_IS_FAIL,null);
    }

    @ApiOperation(value = "品牌概括_发展历程_删除历程信息接口",notes = "删除历程信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "infoId",value = "id",required = true,paramType = "query")
            }
    )
    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteCourse(CourseAdd courseAdd){
        boolean course=courseService.deleteCourse(courseAdd);
        if(course)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.DELETE_SUCCESS,null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE,Message.DELETE_IS_FAIL,null);
    }
}
