package com.example.prac4.data;

public class Repository {
    private Item item;

    public Repository(Item item) {
        this.item = item;
    }

    public Item getItem(Item item){
        return item;
    }

    public void setItem(Item item){
        this.item = item;
    }
}
