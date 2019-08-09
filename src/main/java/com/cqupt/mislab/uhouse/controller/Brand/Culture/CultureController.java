package com.cqupt.mislab.uhouse.controller.Brand.Culture;

import com.cqupt.mislab.uhouse.common.response.ResponseEntity;
import com.cqupt.mislab.uhouse.constant.Message;
import com.cqupt.mislab.uhouse.constant.ReturnCode;
import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureAdd;
import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureGet;
import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureImageGet;
import com.cqupt.mislab.uhouse.service.Brand.Culture.CultureService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand/culture")
public class CultureController {
    @Autowired
    private CultureService cultureService;

    @ApiOperation(value = "品牌概括_企业文化_展示图片信息接口",notes = "展示图片信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query")
            }
    )
    @GetMapping("/Image/get")
    public ResponseEntity<CultureImageGet> getImage(CultureImageGet cultureImageGet){
        CultureImageGet course=cultureService.getImage(cultureImageGet);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.SUCCESS,course);
    }

    @ApiOperation(value = "品牌概括_企业文化_展示全部文化接口",notes = "展示全部文化")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name="projectId",value ="确定项目归属",required = true,paramType = "query")
            }
    )
    @GetMapping("/get")
    public ResponseEntity<CultureGet> getCourse(CultureGet cultureGet){
        List<CultureGet> course=cultureService.getCulture(cultureGet);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.SUCCESS,course);
    }

    @ApiOperation(value = "品牌概括_企业文化_修改背景图片接口",notes="修改背景图片")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name="projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name="pageUrl",value = "背景图片",required = true,paramType = "query"),
                    @ApiImplicitParam(name="cultureUrl",value = "文化图片",required = true,paramType = "query")
            }
    )
    @PutMapping("/Image/update")
    public ResponseEntity<Object> updateImage(CultureImageGet cultureImageGet){
        boolean course=cultureService.updateImage(cultureImageGet);
        if(course)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.UPDATE_SUCCESS,null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE,Message.UPDATE_IS_FAIL,null);
    }

    @ApiOperation(value = "品牌概括_企业文化_修改文化内容",notes = "修改文化内容")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "infoId",value = "id",required = true,paramType = "query"),
                    @ApiImplicitParam(name="cultureTitle",value = "文化标题",required = true,paramType = "query"),
                    @ApiImplicitParam(name="cultureInfo",value = "文化内容",required = true,paramType = "query")
            }
    )
    @PutMapping("/update")
    public ResponseEntity<Object> updateCulture(CultureAdd cultureAdd){
        boolean course=cultureService.updateCulture(cultureAdd);
        if(course)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.UPDATE_SUCCESS,null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE,Message.UPDATE_IS_FAIL,null);
    }

    @ApiOperation(value = "品牌概括_企业文化_新增文化内容接口",notes = "新增文化内容")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId", value = "确定项目归属", required = true, paramType = "query"),
                    @ApiImplicitParam(name = "cultureTitle", value = "文化标题", required = true, paramType = "query"),
                    @ApiImplicitParam(name = "cultureInfo", value = "文化内容", required = true, paramType = "query")
            }
    )
    @PostMapping("/add")
    public ResponseEntity<Object> addCulture(CultureAdd cultureAdd){
        boolean course = cultureService.addCulture(cultureAdd);
        if(course)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.ADD_SUCCESS,cultureAdd);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE,Message.ADD_IS_FAIL,null);
    }

    @ApiOperation(value = "品牌概括_企业文化_删除文化内容接口",notes = "删除文化内容")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "infoId",value = "id",required = true,paramType = "query")
            }
    )
    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteCulture(CultureAdd cultureAdd){
        boolean course=cultureService.deleteCulture(cultureAdd);
        if(course)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE,Message.DELETE_SUCCESS,null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE,Message.DELETE_IS_FAIL,null);
    }
}
