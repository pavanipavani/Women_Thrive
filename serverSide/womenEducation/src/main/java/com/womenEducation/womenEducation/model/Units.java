package com.womenEducation.womenEducation.model;

import jakarta.persistence.*;

@Entity
public class Units {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int units_ID;

    public int getUnits_ID() {
        return units_ID;
    }

    public void setUnits_ID(int units_ID) {
        this.units_ID = units_ID;
    }

    public int getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(int course_ID) {
        this.course_ID = course_ID;
    }

    public String getUnits_NAME() {
        return units_NAME;
    }

    public void setUnits_NAME(String units_NAME) {
        this.units_NAME = units_NAME;
    }

    @Column
    private  int course_ID;

    @Column
    private String units_NAME;
}
