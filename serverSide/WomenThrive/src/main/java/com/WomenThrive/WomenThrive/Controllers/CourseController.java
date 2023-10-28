package com.WomenThrive.WomenThrive.Controllers;
import com.WomenThrive.WomenThrive.model.Course;
import com.WomenThrive.WomenThrive.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Course")
public class CourseController {

    @Autowired
    CourseService CourseService;

    @PostMapping("/create")
    public Course create(@RequestBody Course Course){ return CourseService.create(Course);}

    @GetMapping("")
    public List<Course> getAllCourse() {return CourseService.getAllCourse();}

    @GetMapping("/{id}")
    public Object getOneCourse(@PathVariable Integer id){return CourseService.getOneCourse(id);}

    @PutMapping("/update")
    public Object update(@RequestBody Course Course) {return CourseService.update(Course);}
    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Integer id){return CourseService.deleteCourse(id);}
   @GetMapping("/search")
   public List<Course> getSearch(@RequestParam("query") String name){
        return CourseService.getSearch(name);
   }
}


