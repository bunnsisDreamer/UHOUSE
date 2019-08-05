package com.cqupt.mislab.uhouse.service.Brand.Introduction;

import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionGet;
import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionImageAdd;
import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionImageGet;

import java.util.List;

public interface IntroductionService {
    //用于展示文字和视频
    IntroductionGet getText(IntroductionGet introductionGet);
    //用于查找图片
    List<IntroductionImageGet> getImage(IntroductionImageGet introductionImageGet);
    //用于修改文字和视频
    boolean updateText(IntroductionGet introductionGet);
    //删除图片
    boolean deleteImage(IntroductionImageGet introductionImageGet);
    //添加图片
    boolean addImage(IntroductionImageAdd introductionImageAdd);
}
