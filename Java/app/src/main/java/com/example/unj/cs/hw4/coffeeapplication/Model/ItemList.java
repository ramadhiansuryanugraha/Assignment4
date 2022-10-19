package com.example.unj.cs.hw4.coffeeapplication.Model;

public class ItemList {

    private String rowName;
    private int rowImage;
    private String descriptions;
    private String fulldescription;


    public ItemList(String rowName, int rowImage, String descriptions, String fulldescription) {
        this.rowName = rowName;
        this.rowImage = rowImage;
        this.descriptions = descriptions;
        this.fulldescription = fulldescription;

    }


    public String getFulldescription() {
        return fulldescription;
    }

    public void setFulldescription(String fulldescription) {
        this.fulldescription = fulldescription;
    }


    public int getRowImage() {
        return rowImage;
    }

    public void setRowImage(int rowImage) {
        this.rowImage = rowImage;
    }

    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
