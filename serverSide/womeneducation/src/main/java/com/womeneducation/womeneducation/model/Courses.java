package com.womeneducation.womeneducation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class courseTable {
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
    private int course_ID;

    @Column
    private String course_NAME;
}
