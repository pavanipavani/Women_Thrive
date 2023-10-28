package com.WomenThrive.WomenThrive.service;
import com.WomenThrive.WomenThrive.model.Course;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    public Course create (Course course);

    public List<Course> getAllCourse();

    public Object getOneCourse(Integer id);

    public Object update(Course course);

    public String  deleteCourse(Integer id) ;


 public List<Course> getSearch(String name);

}
