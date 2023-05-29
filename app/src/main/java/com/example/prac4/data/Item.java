package com.example.prac4.data;

public class Item {
    Integer imageId;
    String itemText;

    public Item(Integer imageId, String itemText) {
        super();
        this.imageId = imageId;
        this.itemText = itemText;
    }

    public void setText(String itemText) {
        this.itemText = itemText;
    }

    public String getText() {
        return itemText;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }
}