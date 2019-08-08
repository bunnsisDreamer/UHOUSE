package com.cqupt.mislab.uhouse.service.Brand.Course;

import com.cqupt.mislab.uhouse.dao.Brand.Course.CourseMapper;
import com.cqupt.mislab.uhouse.model.Brand.Course.CourseAdd;
import com.cqupt.mislab.uhouse.model.Brand.Course.CourseGet;
import com.cqupt.mislab.uhouse.model.Brand.Course.CourseImageGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public CourseImageGet findImageByProjectId(CourseImageGet courseImageGet){
        return courseMapper.findImageByProjectId(courseImageGet.getProjectId());
    }

    @Override
    public List<CourseGet> findCourseByProjectId(CourseGet courseGet){
        return courseMapper.findCourseByProjectId(courseGet.getProjectId());
    }

    @Override
    public boolean updateImage(CourseImageGet courseImageGet){
        return courseMapper.updateImage(courseImageGet);
    }

    @Override
    public boolean updateCourse(CourseAdd courseAdd){
        return courseMapper.updateCourse(courseAdd);
    }

    @Override
    public boolean addCourse(CourseAdd courseAdd){
        return courseMapper.addCourse(courseAdd);
    }

    @Override
    public boolean deleteCourse(CourseAdd courseAdd){
        return courseMapper.deleteCourse(courseAdd);
    }
}
