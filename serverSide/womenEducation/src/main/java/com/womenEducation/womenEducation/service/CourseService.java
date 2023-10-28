package com.womenEducation.womenEducation.service;

import com.womenEducation.womenEducation.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    public  Course create(Course course);

    public List<Course> getAllCourses();

    public  Course getOneCourse(Integer id);
    public Course update(Course course);
    public  String deleteCourse(Integer id);

    public List<Course> getSearch(String name);
}
