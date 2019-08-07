package com.cqupt.mislab.uhouse.service.Brand.Honor;

import com.cqupt.mislab.uhouse.dao.Brand.Honor.HonorMapper;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorAdd;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorGet;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorImageAdd;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorImageGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HonorServiceImp implements HonorService {
    private final HonorMapper honorMapper;

    @Autowired
    public HonorServiceImp(HonorMapper honorMapper) {
        this.honorMapper = honorMapper;
    }

    @Override
    public List<HonorGet> getText(HonorGet honorGet){
        return honorMapper.findTextByProjectId(honorGet.getProjectId());
    }

    @Override
    public List<HonorImageGet> getImage(HonorImageGet honorImageGet){
        return honorMapper.getImageByProjectId(honorImageGet.getProjectId());
    }

    @Override
    public boolean addText(HonorAdd honorAdd){
        return honorMapper.addText(honorAdd);
    }

    @Override
    public boolean updateText(HonorGet honorGet){
        return honorMapper.updateText(honorGet);
    }

    @Override
    public boolean deleteText(HonorGet honorGet){
        return honorMapper.deleteText(honorGet);
    }

    @Override
    public boolean addImage(HonorImageAdd honorImageAdd){
        return honorMapper.addImage(honorImageAdd);
    }

    @Override
    public boolean deleteImage(HonorImageAdd honorImageAdd){
        return honorMapper.deleteImage(honorImageAdd);
    }

    @Override
    public boolean updatePictureDescription(HonorImageGet honorImageGet){
        return honorMapper.updatePictureDescription(honorImageGet);
    }
}
