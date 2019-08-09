package com.cqupt.mislab.uhouse.dao.Brand.Culture;

import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureAdd;
import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureGet;
import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureImageGet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CultureMapper {
    //展示图片信息
    CultureImageGet findImageByProjectId(int projectId);

    //展示全部文化
    List<CultureGet> findCultureByProjectId(int projectId);

    //修改背景图片
    boolean updateImage(CultureImageGet cultureImageGet);

    //修改文化内容
    boolean updateCulture(CultureAdd cultureAdd);

    //增加文化内容
    boolean addCulture(CultureAdd cultureAdd);

    //删除文化内容
    boolean deleteCulture(CultureAdd cultureAdd);
}
