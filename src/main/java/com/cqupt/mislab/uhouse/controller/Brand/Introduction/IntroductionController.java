package com.cqupt.mislab.uhouse.controller.Brand.Introduction;

import com.cqupt.mislab.uhouse.common.response.ResponseEntity;
import com.cqupt.mislab.uhouse.constant.Message;
import com.cqupt.mislab.uhouse.constant.ReturnCode;
import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionGet;
import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionImageAdd;
import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionImageGet;
import com.cqupt.mislab.uhouse.service.Brand.Introduction.IntroductionService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/introduction")
public class IntroductionController {

    @Autowired
    private IntroductionService introductionService;


    @ApiOperation(value="品牌概括_企业简介_展示文字及视频接口",notes = "展示文字视频")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query")
            }
    )
    @GetMapping("/get")
    public ResponseEntity<IntroductionGet> getText(IntroductionGet introductionGet){
        IntroductionGet intro=introductionService.getText(introductionGet);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.SUCCESS,intro);
    }


    @ApiOperation(value="品牌概括_企业简介_展示图片接口",notes = "展示图片")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query")
            }
    )
    @GetMapping("/image/get")
    public ResponseEntity<IntroductionImageGet> getImage(IntroductionImageGet introductionImageGet){
        List<IntroductionImageGet> intro=introductionService.getImage(introductionImageGet);
        return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.SUCCESS,intro);
    }



    @ApiOperation(value="品牌概括_企业简介_修改文字和视频接口",notes = "修改文字视频")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "name",value = "公司名",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "description",value = "简介具体内容",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "videoUrl",value = "视频路径",required = true,paramType = "query")

            }
    )
    @PutMapping("/update")
    public ResponseEntity<Object> updateText(IntroductionGet introductionGet){
        boolean flag=introductionService.updateText(introductionGet);
        if (flag)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.SUCCESS, null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE, Message.UPDATE_IS_FAIL, null);
    }



    @ApiOperation(value="品牌概括_企业简介_添加图片接口",notes = "添加图片")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "pictureDescription",value = "图片描述",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "url",value = "图片",required = true,paramType = "query")
            }
    )
    @PostMapping("/image/add")
    public ResponseEntity<Object> addImage(IntroductionImageAdd introductionImageAdd){
        boolean flag=introductionService.addImage(introductionImageAdd);
        if(flag)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.SUCCESS,introductionImageAdd);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE, Message.UPDATE_IS_FAIL, null);
    }


    @ApiOperation(value="品牌概括_企业简介_删除图片接口",notes = "删除图片")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "projectId",value = "确定项目归属",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "pictureId",value = "图片",required = true,paramType = "query")
            }
    )
    @DeleteMapping("/image/delete")
    public ResponseEntity<Object> deleteImage(IntroductionImageGet introductionImageGet){
        boolean flag=introductionService.deleteImage(introductionImageGet);
        if (flag)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.SUCCESS, null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE, Message.UPDATE_IS_FAIL, null);
    }

}
