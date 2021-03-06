package com.linhnv.tikitest.model;

/**
 * Created by linhnv on 22/09/2018.
 */

public class Keyword {

    private String keyword;
    private int color;

    public Keyword(String keyword, int color) {
        this.keyword = keyword;
        this.color = color;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
