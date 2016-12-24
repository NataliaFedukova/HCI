package com.fedukova.studentmodule.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Хозяюшка on 24.12.2016.
 */

@DatabaseTable(tableName = "course")
public class Course {

    @DatabaseField(id = true)
    private int id_course;

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }
}
