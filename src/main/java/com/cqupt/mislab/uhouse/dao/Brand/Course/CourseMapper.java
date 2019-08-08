package com.cqupt.mislab.uhouse.dao.Brand.Course;

import com.cqupt.mislab.uhouse.model.Brand.Course.CourseAdd;
import com.cqupt.mislab.uhouse.model.Brand.Course.CourseGet;
import com.cqupt.mislab.uhouse.model.Brand.Course.CourseImageGet;
import com.cqupt.mislab.uhouse.model.Brand.Honor.HonorImageGet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {
    //用于展示背景图片
    CourseImageGet findImageByProjectId(int projectId);

    //用于展示历程信息
    List<CourseGet> findCourseByProjectId(int projectId);

    //用于修改背景图片
    boolean updateImage(CourseImageGet courseImageGet);

    //用于修改历程信息
    boolean updateCourse(CourseAdd courseAdd);

    //用于新增历程信息
    boolean addCourse(CourseAdd courseAdd);

    //用于删除历程信息
    boolean deleteCourse(CourseAdd courseAdd);

}
