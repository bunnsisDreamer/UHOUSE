package com.cqupt.mislab.uhouse.service.Brand.Introduction;

import com.cqupt.mislab.uhouse.dao.Brand.Introduction.IntroductionMapper;
import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionGet;
import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionImageAdd;
import com.cqupt.mislab.uhouse.model.Brand.Introduction.IntroductionImageGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntroductionServiceImp implements IntroductionService{
    @Autowired
    private IntroductionMapper introductionMapper;

    @Override
    public IntroductionGet getText(IntroductionGet introductionGet){
        return introductionMapper.findTextByProjectId(introductionGet.getProjectId());
    }

    @Override
    public List<IntroductionImageGet> getImage(IntroductionImageGet introductionImageGet){
        return introductionMapper.findImageByProjectId(introductionImageGet.getProjectId());
    }

    @Override
    public boolean updateText(IntroductionGet introductionGet){
        return introductionMapper.updateText(introductionGet);

    }

    @Override
    public boolean deleteImage(IntroductionImageGet introductionImageGet){
        return introductionMapper.deleteImage(introductionImageGet);

    }

    @Override
    public boolean addImage(IntroductionImageAdd introductionImageAdd){
        return introductionMapper.addImage(introductionImageAdd);
    }

}
