package com.cryolite;

import org.springframework.stereotype.Component;

@Component
public class SubChild {

    public SubChild(){}

    public SubChild(String index){
        super();
        this.index = index;
    }

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
