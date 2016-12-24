package com.fedukova.studentmodule.entity;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "debts")
public class Debts {
    @DatabaseField(generatedId = true)
    private int id_debts;
    @DatabaseField
    private String description;
    @DatabaseField(dataType = DataType.DOUBLE)
    private double price;

    public int getId_debts() {
        return id_debts;
    }

    public void setId_debts(int id_debts) {
        this.id_debts = id_debts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
