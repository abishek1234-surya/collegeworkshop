package model;

import java.util.Date;


public class Student {
    private String studentId;
    private String name;
    private String course;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    private Date startDate;
    private Date endDate;
}
