package com.cqupt.mislab.uhouse.service.Brand.Culture;

import com.cqupt.mislab.uhouse.dao.Brand.Culture.CultureMapper;
import com.cqupt.mislab.uhouse.model.Brand.Culture.Culture;
import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureAdd;
import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureGet;
import com.cqupt.mislab.uhouse.model.Brand.Culture.CultureImageGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CultureServiceImp implements CultureService {
    @Autowired
    private CultureMapper cultureMapper;

    @Override
    public CultureImageGet getImage(CultureImageGet cultureImageGet){
        return cultureMapper.findImageByProjectId(cultureImageGet.getProjectId());
    }

    @Override
    public List<CultureGet> getCulture(CultureGet cultureGet){
        return cultureMapper.findCultureByProjectId(cultureGet.getProjectId());
    }

    @Override
    public boolean updateImage(CultureImageGet cultureImageGet){
        return cultureMapper.updateImage(cultureImageGet);
    }

    @Override
    public boolean updateCulture(CultureAdd cultureAdd){
        return cultureMapper.updateCulture(cultureAdd);
    }

    @Override
    public boolean addCulture(CultureAdd cultureAdd){
        return cultureMapper.addCulture(cultureAdd);
    }

    @Override
    public boolean deleteCulture(CultureAdd cultureAdd){
        return cultureMapper.deleteCulture(cultureAdd);
    }
}
