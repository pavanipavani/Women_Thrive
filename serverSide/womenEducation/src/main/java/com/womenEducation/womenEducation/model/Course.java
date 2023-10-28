package com.womenEducation.womenEducation.model;

import jakarta.persistence.*;


@Entity
public class Course {
    public int getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(int course_ID) {
        this.course_ID = course_ID;
    }

    public String getCourse_NAME() {
        return course_NAME;
    }

    public void setCourse_NAME(String course_NAME) {
        this.course_NAME = course_NAME;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int course_ID;

    @Column
    private String course_NAME;

}
