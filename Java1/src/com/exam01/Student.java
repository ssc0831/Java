package com.exam01;

public class Student {
	private String name;
    private String department;
    private int studentID;
    private double avg;

    public Student(String name, String department, int studentID, double avg) {
        this.name = name;
        this.department = department;
        this.studentID = studentID;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getAvg() {
        return avg;
    }
}
