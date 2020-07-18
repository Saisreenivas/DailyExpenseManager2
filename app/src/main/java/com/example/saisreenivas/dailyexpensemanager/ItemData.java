package com.example.saisreenivas.dailyexpensemanager;

/**
 * Created by Sai sreenivas on 12/21/2016.
 */

public class ItemData {
    String text;
    Integer imageId;

    public ItemData(String text, Integer imageId) {
        this.text = text;
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public Integer getImageId() {
        return imageId;
    }
}
