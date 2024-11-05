package com.rafa.model;

public class ClickCounterModel {
    private int clickCount = 0;

    public void incrementCount() {
        clickCount++;
    }

    public int getClickCount() {
        return clickCount;
    }
}
