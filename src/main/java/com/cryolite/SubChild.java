package com.cryolite;

import org.springframework.stereotype.Component;

public class SubChild {
    private String index;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "SubChild{" +
                "index='" + index + '\'' +
                '}';
    }

}
