package com.cqupt.mislab.uhouse.controller.Brand.Honor;


import com.cqupt.mislab.uhouse.common.response.ResponseEntity;
import com.cqupt.mislab.uhouse.constant.Message;
import com.cqupt.mislab.uhouse.constant.ReturnCode;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorAdd;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorGet;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorImageAdd;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorImageGet;
import com.cqupt.mislab.uhouse.service.Brand.Honor.HonorService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand/honor")
public class HonorController {

    private final HonorService honorService;

    @Autowired
    public HonorController(HonorService honorService) {
        this.honorService = honorService;
    }

    @ApiOperation(value = "品牌概括_品牌荣誉_展示文字信息接口",notes = "展示文字信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query")
            }
    )
    @GetMapping("/get")
    public ResponseEntity<HonorGet> getText(HonorGet honorGet){
        List<HonorGet> honor=honorService.getText(honorGet);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.SUCCESS,honor);
    }


    @ApiOperation(value = "品牌概括_品牌荣誉_展示图片信息接口",notes = "展示图片信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query")
            }
    )
    @GetMapping("/image/get")
    public ResponseEntity<HonorImageGet> getImage(HonorImageGet honorImageGet){
        List<HonorImageGet> honor=honorService.getImage(honorImageGet);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.SUCCESS,honor);
    }


    @ApiOperation(value = "品牌概括_品牌荣誉_增加荣誉接口",notes = "增加荣誉信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "honorInfo",value = "增加的荣誉信息",required = true,paramType = "query")
            }
    )
    @PostMapping("/add")
    public ResponseEntity<Object> addText(HonorAdd honorAdd){
        boolean honor=honorService.addText(honorAdd);
        if(honor)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.ADD_SUCCESS,honorAdd);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE, Message.ADD_IS_FAIL,null);
    }


    @ApiOperation(value = "品牌概括_品牌荣誉_修改荣誉接口",notes = "修改荣誉信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "infoId",value = "要修改的荣誉",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "honorInfo",value = "荣誉内容",required = true,paramType = "query")
            }
    )
    @PostMapping("/update")
    public ResponseEntity<Object> updateText(HonorGet honorGet){
        boolean honor=honorService.updateText(honorGet);
        if(honor)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.UPDATE_SUCCESS,honorGet);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE, Message.UPDATE_IS_FAIL,null);
    }


    @ApiOperation(value = "品牌概括_品牌荣誉_删除荣誉接口",notes = "删除荣誉信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "infoId",value = "要删除的荣誉",required = true,paramType = "query")
            }
    )
    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteText(HonorGet honorGet){
        boolean honor=honorService.deleteText(honorGet);
        if(honor)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.DELETE_SUCCESS,null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE, Message.DELETE_IS_FAIL,null);
    }


    @ApiOperation(value = "品牌概括_品牌荣誉_增加图片接口",notes = "增加图片")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "pictureDescription",value = "图片描述",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "url",value = "图片",required = true,paramType = "query")
            }
    )
    @PostMapping("/image/add")
    public ResponseEntity<Object> addImage(HonorImageAdd honorImageAdd){
        boolean honor=honorService.addImage(honorImageAdd);
        if(honor)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.ADD_SUCCESS,honorImageAdd);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE, Message.ADD_IS_FAIL,null);
    }


    @ApiOperation(value = "品牌概括_品牌荣誉_删除图片接口",notes = "删除图片")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "pictureId",value = "图片",required = true,paramType = "query"),
            }
    )
    @DeleteMapping("/image/delete")
    public ResponseEntity<Object> deleteImage(HonorImageAdd honorImageAdd){
        boolean honor=honorService.deleteImage(honorImageAdd);
        if(honor)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.DELETE_SUCCESS,null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE, Message.DELETE_IS_FAIL,null);
    }

    @ApiOperation(value = "品牌概括_品牌荣誉_修改图片描述接口",notes = "修改图片描述")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "pictureId",value = "确定图片",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "pictureDescription",value = "图片描述",required = true,paramType = "query"),
            }
    )
    @PostMapping("/image/update")
    public ResponseEntity<Object> updatePictureDescription(HonorImageGet honorImageGet){
        boolean honor=honorService.updatePictureDescription(honorImageGet);
        if(honor)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.UPDATE_SUCCESS,null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE, Message.UPDATE_IS_FAIL,null);
    }




}
