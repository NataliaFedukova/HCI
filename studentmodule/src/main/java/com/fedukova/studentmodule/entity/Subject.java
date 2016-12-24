package com.fedukova.studentmodule.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "subject")
public class Subject {

    @DatabaseField(generatedId = true)
    private int id_subject;
    @DatabaseField
    private String sname;
    @DatabaseField
    private String description;
}
