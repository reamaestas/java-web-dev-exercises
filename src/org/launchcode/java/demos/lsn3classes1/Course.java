package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String topic;
    private int credits;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, int credits, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.credits = credits;
        this.enrolledStudents = enrolledStudents;
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}

