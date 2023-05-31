package org.example;

public class Course { //Clase Curso
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getters and setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // toString
    @Override
    public String toString() {
        return "Curso{" +
                "idCurso='" + courseId + '\'' +
                ", nombre del Curso ='" + courseName + '\'' +
                '}';
    }

}
