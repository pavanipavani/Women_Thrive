package com.WomenThrive.WomenThrive.service.impl;

import com.WomenThrive.WomenThrive.model.Course;
import com.WomenThrive.WomenThrive.repository.CourseRepository;
import com.WomenThrive.WomenThrive.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository  CourseRepository;
    @Override
    public Course create(Course Course){return CourseRepository.save(Course);}
    @Override
    public List<Course> getAllCourse(){return CourseRepository.findAll();}

    @Override
    public Course getOneCourse(Integer id){return CourseRepository.findById(id).get();}

    @Override
    public Course update(Course Course){return CourseRepository.save(Course);}

    @Override
    public String deleteCourse(Integer id){CourseRepository.deleteById(id);
        return "Course is deleted successfully";
    }
    @Override
    public List<Course>getSearch(String name){return CourseRepository.getSearch(name);
    }
}
