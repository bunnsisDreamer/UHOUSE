package com.cqupt.mislab.uhouse.service.Project;


import com.cqupt.mislab.uhouse.dao.ManageMapper;
import com.cqupt.mislab.uhouse.model.project.ProjectBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private ManageMapper manageMapper;

    /*
    用于选择项目
     */
    @Override
    public ProjectBasic findProjectByProjectName(String projectName) {
        return manageMapper.findProjectByProjectName(projectName);
    }

    /*
    用于显示所有项目
    */
    @Override
    public List<ProjectBasic> findAllProject() {
        return manageMapper.findAllProject();
    }

    /*
    用于添加项目
     */
    @Override
    public boolean addProject(ProjectBasic project) {
        return manageMapper.addProject(project);
    }

    @Override
    public boolean updateProject(ProjectBasic project) {
        return false;
    }

}
