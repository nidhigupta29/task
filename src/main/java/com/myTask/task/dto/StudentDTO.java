package com.myTask.task.dto;

import java.util.List;

public class StudentDTO {
    private String name;
    private long studentNumber;
    private String email;
    private List<String> courseList;
    private float gpa;

    public StudentDTO() {
    }

    public StudentDTO(String name, long studentNumber, String email, List<String> courseList, float gpa) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.email = email;
        this.courseList = courseList;
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", studentNumber=" + studentNumber +
                ", email='" + email + '\'' +
                ", courseList=" + courseList +
                ", gpa=" + gpa +
                '}';
    }
}
