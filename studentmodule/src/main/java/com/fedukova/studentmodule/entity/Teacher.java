package com.fedukova.studentmodule.entity;


import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "teacher")
public class Teacher {

    @DatabaseField(generatedId = true )
    private int id_teacher;

    @DatabaseField(canBeNull = false, dataType = DataType.STRING)
    private String name;

    @DatabaseField(canBeNull = false, foreign = true)
    private int faculty;

    public Teacher(){}
    public Teacher(int id, String name, int faculty){
        this.id_teacher = id;
        this.name = name;
        this.faculty = faculty;
    }

    public void setId_teacher(int id){this.id_teacher = id;}
    public void setName(String name){this.name = name;}
    public void setFaculty(int f){this.faculty = f;}

    public int getId_teacher(){return id_teacher;}
    public int getFaculty(){return faculty;}
    public String getName(){return name;}
}
