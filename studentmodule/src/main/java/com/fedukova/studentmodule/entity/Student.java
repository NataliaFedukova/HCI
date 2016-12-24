package com.fedukova.studentmodule.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "student")
public class Student {

    @DatabaseField(generatedId = true, foreign = true)
    private int id_student;
    @DatabaseField
    private String name;
    @DatabaseField
    private String email;
    @DatabaseField(foreign = true)
    private int faculty;
    @DatabaseField(foreign = true)
    private int course;
    @DatabaseField(foreign = true)
    private int group;
    @DatabaseField(foreign = true)
    private int debits;

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getDebits() {
        return debits;
    }

    public void setDebits(int debits) {
        this.debits = debits;
    }
}
