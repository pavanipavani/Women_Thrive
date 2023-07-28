package com.womenEducation.womenEducation.controllers;
import com.womenEducation.womenEducation.model.Course;
import com.womenEducation.womenEducation.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.PresentationDirection;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService CourseService;

    @PostMapping("/create")
    public Course create(@RequestBody Course course){ return CourseService.create(course);}

    @GetMapping("")
    public List<Course> getAllCourses() {return CourseService.getAllCourses();}

    @GetMapping("/{id}")
    public Course getOneCourse(@PathVariable Integer id){return CourseService.getOneCourse(id);}

    @PutMapping("/update")
    public Course update(@RequestBody Course course) {return CourseService.update(course);}



    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Integer id) {return CourseService.deleteCourse(id);}
    @GetMapping("/search")
    public List<Course> getSearch(@RequestParam("query") String name){
        return CourseService.getSearch(name);
    }
}
