package com.cqupt.mislab.uhouse.service.Brand.Honor;

import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorAdd;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorGet;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorImageAdd;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorImageGet;

import java.util.List;

public interface HonorService {
    //用于展示文字信息
    List<HonorGet> getText(HonorGet honorGet);

    //用于展示图片信息
    List<HonorImageGet> getImage(HonorImageGet honorImageGet);

    //用于增加荣誉信息
    boolean addText(HonorAdd honorAdd);


    //用于修改荣誉信息
    boolean updateText(HonorGet honorGet);


    //用于删除荣誉信息
    boolean deleteText(HonorGet honorGet);


    //用于增加图片
    boolean addImage(HonorImageAdd honorImageAdd);


    //用于删除图片
    boolean deleteImage(HonorImageAdd honorImageAdd);


    //用于修改图片描述
    boolean updatePictureDescription(HonorImageGet honorImageGet);
}
