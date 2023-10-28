package com.WomenThrive.WomenThrive.repository;

import com.WomenThrive.WomenThrive.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository <Course, Integer>{
   @Query("select l from Course l where l.course_NAME like %?1%")
   List<Course> getSearch(String name);
}
