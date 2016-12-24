package com.fedukova.studentmodule.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "faculty")
public class Faculty {

    @DatabaseField(generatedId = true)
    private int id_faculty;
    @DatabaseField
    private String fname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getId_faculty() {

        return id_faculty;
    }

    public void setId_faculty(int id_faculty) {
        this.id_faculty = id_faculty;
    }
}
