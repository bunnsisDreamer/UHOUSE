package com.cqupt.mislab.uhouse.dao.Brand.Introduction;

import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionGet;
import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionImageAdd;
import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionImageGet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntroductionMapper {
    //用于展示文字和视频
    IntroductionGet findTextByProjectId(int projectId);
    //用于查找图片
    List<IntroductionImageGet> findImageByProjectId(int projectId);
    //用于修改文字和视频地址
    boolean updateText(IntroductionGet introduction);
    //删除图片
    boolean deleteImage(IntroductionImageGet introduction);
    //添加图片
    boolean addImage(IntroductionImageAdd introductionImageAdd);
}
