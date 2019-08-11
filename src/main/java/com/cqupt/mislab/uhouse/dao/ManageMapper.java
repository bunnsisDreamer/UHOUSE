package com.cqupt.mislab.uhouse.dao;

import com.cqupt.mislab.uhouse.model.project.ProjectBasic;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManageMapper {
    /**
     * 用于选择项目*/

    ProjectBasic findProjectByProjectName(String projectName);

    /**
     * 用于返回项目列表*/

    List<ProjectBasic> findAllProject();

    /**
     * 用于添加项目*/

    boolean addProject(ProjectBasic project);

    /**
     * 用于更新项目*/

    boolean updateProject(ProjectBasic project);

}
