package com.cqupt.mislab.uhouse.service.Brand.Culture;

import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureAdd;
import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureGet;
import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureImageGet;

import java.util.List;

public interface CultureService {
    //展示图片信息
    CultureImageGet getImage(CultureImageGet cultureImageGet);

    //展示全部文化
    List<CultureGet> getCulture(CultureGet cultureGet);

    //修改背景图片
    boolean updateImage(CultureImageGet cultureImageGet);

    //修改文化内容
    boolean updateCulture(CultureAdd cultureAdd);

    //增加文化内容
    boolean addCulture(CultureAdd cultureAdd);

    //删除文化内容
    boolean deleteCulture(CultureAdd cultureAdd);
}
