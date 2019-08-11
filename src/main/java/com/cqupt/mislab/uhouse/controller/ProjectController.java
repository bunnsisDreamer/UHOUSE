package com.cqupt.mislab.uhouse.controller;

import com.cqupt.mislab.uhouse.common.response.ResponseEntity;
import com.cqupt.mislab.uhouse.constant.Message;
import com.cqupt.mislab.uhouse.constant.ReturnCode;
import com.cqupt.mislab.uhouse.model.project.ProjectBasic;
import com.cqupt.mislab.uhouse.service.Project.ManageService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ManageService manageService;

    @Autowired
    public ProjectController(ManageService manageService) {
        this.manageService = manageService;
    }

    @ApiOperation(value = "项目展示",notes = "显示项目列表")

    @GetMapping("/get")
    public ResponseEntity<List<ProjectBasic>> findAllProject(){
        List<ProjectBasic> projectBasicList=manageService.findAllProject();
        return new ResponseEntity(ReturnCode.SUCCESS_CODE, Message.SUCCESS,projectBasicList);
    }

    @ApiOperation(value = "项目展示",notes = "通过项目名查找项目")

    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectName",value = "项目名称",required = true,paramType = "query")
            }
    )

    @GetMapping("/search")
    public ResponseEntity<ProjectBasic> findByProjectName(String projectName){
        if(projectName!=null){
            ProjectBasic projectBasic=manageService.findProjectByProjectName(projectName);
            return new ResponseEntity(ReturnCode.SUCCESS_CODE, Message.SUCCESS,projectBasic);
        }
        else{
            return new ResponseEntity(ReturnCode.FAIL_CODE, Message.NULL_PROJECT_NAME,null);
        }
    }

    @ApiOperation(value = "项目修改",notes = "新建项目")

    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "项目编号",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "projectName",value = "项目名称",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "basicInform",value = "基本介绍",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "phoneNum",value = "电话号码",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "description",value = "具体描述",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "QR_codeUrl",value = "二维码地址",required = true,paramType = "query")
            }
    )

    @PostMapping("/add")
    public ResponseEntity<ProjectBasic> addProject(ProjectBasic project){

        boolean projectExists = manageService.addProject(project);

        if(projectExists){
            return new ResponseEntity(ReturnCode.SUCCESS_CODE, Message.SUCCESS,project);
        }
        else{
            return new ResponseEntity(ReturnCode.FAIL_CODE, Message.ADD_PROJECT_IS_FAIL,null);
        }
    }


}
