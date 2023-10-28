package com.womenEducation.womenEducation.service.impl;

import com.womenEducation.womenEducation.model.Course;
import com.womenEducation.womenEducation.repository.CourseRepository;
import com.womenEducation.womenEducation.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceimpl implements CourseService {
    @Autowired
    CourseRepository  courseRepository;

    @Override
    public Course create(Course course) {return courseRepository.save(course);}

    @Override
    public List<Course> getAllCourses() {return courseRepository.findAll();}

    @Override
    public  Course getOneCourse(Integer id) {return courseRepository.findById(id).get();}
    @Override
    public Course update(Course course) {return courseRepository.save(course);}
    @Override
    public String deleteCourse(Integer id){
        courseRepository.deleteById(id);
        return "Course details are successfull deleted";
    }

    @Override
    public List<Course> getSearch(String name) {
        return courseRepository.getSearch(name);
    }
}
