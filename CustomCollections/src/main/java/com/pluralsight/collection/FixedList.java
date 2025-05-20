package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T>{
    private List<T> item;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.item = new ArrayList<>();
    }

    public void add (T items){
        if (item.size()>= maxSize){
            System.out.println("You can't add more items");
        }else {
            item.add(items);
        }

    }

    public List<T> getItem() {
        return item;
    }
}
